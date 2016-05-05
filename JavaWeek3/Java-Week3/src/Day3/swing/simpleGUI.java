package Day3.swing;

/**
 * Created by student on 05-May-16.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;


public class simpleGUI implements ActionListener {

   static JFrame frame = new JFrame("My first Application");
   static JButton button = new JButton("Click Me");

    public static void main(String[] args)
    {

        simpleGUI gui = new simpleGUI();
        gui.go();
    }

    public void go()
    {
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent event )
    {
        button.setText(("clicked me!"));
    }

}
