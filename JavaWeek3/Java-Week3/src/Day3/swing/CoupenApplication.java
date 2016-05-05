package Day3.swing;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by student on 05-May-16.
 */
public class CoupenApplication extends JFrame {

    public CoupenApplication()
    {
        super("Coupen Application");
        setSize(300,200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Coupon[] cup = new Coupon[]{new Coupon(4.15,"Satay Coupon"),new Coupon(1.00,"maccarooms")};

        JComboBox comboBox = new JComboBox(cup);
        getContentPane().add(comboBox);

        //create button

        JButton button = new JButton("Save to file");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object Item = comboBox.getSelectedItem();
                if(Item == null)
                {
                    Showmessage("Please select a coupen");
                }
                else
                {
                    Coupon coupen = (Coupon) Item;
                    try
                    {
                        coupen.saveToAFile("coupen.txt");
                    }
                    catch (FileNotFoundException e1)
                    {
                        Showmessage("cannot find the file SWATI!");
                    }
                }
            }
        });
        getContentPane().add(button);
        setVisible(true);
    }

    public void Showmessage(String Message)
    {
        JOptionPane.showMessageDialog(this,Message);
    }

    public static void main(String[] args)
    {
        new CoupenApplication();
    }
}
