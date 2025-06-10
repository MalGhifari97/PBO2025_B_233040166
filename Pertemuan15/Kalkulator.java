package Pertemuan15;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

public class Kalkulator extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton sumButton;

    public Kalkulator() {
        setTitle("Penjumlahan");
        setSize(250, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        setLayout(new GridLayout(3, 1, 10, 10)); 

        // Inisialisasi komponen JTextField
        textField1 = new JTextField(); 
        textField2 = new JTextField();

        // Inisialisasi komponen JButton
        sumButton = new JButton("Jumlah");

        // Menambahkan ActionListener ke tombol
        sumButton.addActionListener(this);

        // Menambahkan komponen ke frame
        add(textField1);
        add(textField2);
        add(sumButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sumButton) {
            try {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                JOptionPane.showMessageDialog(this, "Jumlah: " + sum, "Message", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Masukkan angka yang valid di kedua kolom.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
