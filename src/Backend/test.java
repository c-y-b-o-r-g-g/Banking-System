package Backend;

import Frontend.HomePanel;

import javax.swing.*;
import java.awt.*;

public class test {

    static JFrame f;

    // JButton
    static JButton b, b1, b2;

    // Label to display text
    static JLabel l;

    // Main class
    public static void main(String[] args) {
        // // Creating a new frame to store text field and
        // // button
        // f = new JFrame("panel");
        //
        // // Creating a label to display text
        // l = new JLabel("panel label");
        //
        // // Creating a new buttons
        // b = new JButton("button1");
        // b1 = new JButton("button2");
        // b2 = new JButton("button3");
        //
        // // Creating a panel to add buttons
        // JPanel p = new JPanel();
        //
        // // Adding buttons and textfield to panel
        // // using add() method
        // p.add(b);
        // p.add(b1);
        // p.add(b2);
        // p.add(l);
        //
        // // setbackground of panel
        // p.setBackground(Color.BLUE);
        //
        // // Adding panel to frame
        // f.add(p);
        //
        // // Setting the size of frame
        // f.setSize(300, 300);
        // f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // f.show();

        f = new JFrame("Frame");
        f.setSize(500, 500);
        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        f.add(p);
        b = new JButton("jbutton");
        b.setBackground(Color.white);
        b.setBounds(10, 10, 100, 30);
        p.add(b);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.show();

    }
}
