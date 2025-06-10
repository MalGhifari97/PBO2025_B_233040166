package Pertemuan15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello, World!");

        button = new JButton("Click Me!");
        button.addActionListener(this);

        setLayout(new GridLayout(2, 1));
        add(label);
        add(button);
        setTitle("my first program");
        setVisible(true);
        setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");
    }
}
