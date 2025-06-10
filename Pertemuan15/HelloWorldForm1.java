package Pertemuan15;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {
    private JLabel label;

    public HelloWorldForm1() {
        label = new JLabel("Hello, World!");
        label.setText("Hello, World!");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}
