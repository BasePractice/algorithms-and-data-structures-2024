package ru.mirea.practice.s23l0908.task1;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add themup");
    @SuppressWarnings("unused")
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    Main() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(ae -> {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                JOptionPane.showMessageDialog(null, x1 + " + "
                    + x2 + " = " + (x1 + x2)
                    + "\n"
                    + x1 + " - " + x2 + " = " + (x1 - x2)
                    + "\n" + x1 + " * " + x2 + " = " + (x1 * x2)
                    + "\n" + x1 + " / " + x2 + " = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in Numbers !", " alert ", JOptionPane.ERROR_MESSAGE);
            }
        });

    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
