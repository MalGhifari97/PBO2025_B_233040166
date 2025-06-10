package Pertemuan15;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm2 extends JFrame {
     private JLabel label;

    public HelloWorldForm2() {
        label = new JLabel("Hello, World!");
        label.setText("Hallo, Dunia!");

        add(label);
        setTitle("Program Pertama");

        setSize(600, 300);
    }
}
