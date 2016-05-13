package Day4;

import Day3.swing.simpleGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 * Created by student on 06-May-16.
 */
public class CharacterIndexingProgram
{
    JPanel jp = new JPanel(new BorderLayout());
    private final static String newline = "\n";
    static JFrame frame ;

    static JButton button ;
    static JTextArea  textArea;
    static JTextField textField;
    static JLabel label;

    public static void main(String[] args)
    {
        CharacterIndexingProgram cip = new CharacterIndexingProgram();
        cip.go();
    }

    public void go()
    {
        label = new JLabel();
        frame = new JFrame("My Application");
        frame.setLayout(new FlowLayout());
        button = new JButton("Okay");
        textArea = new JTextArea(10,10);
        textField = new JFormattedTextField();

        jp.add(textArea,BorderLayout.CENTER);
        jp.add(textField,BorderLayout.CENTER);
        jp.add(button,BorderLayout.CENTER);
        jp.add(label,BorderLayout.CENTER);

        jp.setLayout(new BoxLayout(jp,BoxLayout.Y_AXIS));

        frame.getContentPane().add(jp);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        //textField.addActionListener();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ButtonClick(textArea.getText(),textField.getText());
            }
        });
    }

        public void ButtonClick(String str1,String str2)
        {
            String text = textArea.getText();
            String chr= textField.getText();
            char chr1 =  chr.charAt(chr.compareToIgnoreCase(chr));

            int counter = 0;
            for( int i=0; i<text.length(); i++ ) {
                if( text.charAt(i) == chr1 ) {
                    counter++;

                    System.out.println(counter);
                }
                label.setText("You found character :  " +  chr1 + "number is :" + counter );
            }

            button.setText(("you are done with charater!"));

        }

}

