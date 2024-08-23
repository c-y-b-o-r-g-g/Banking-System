package Frontend;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}