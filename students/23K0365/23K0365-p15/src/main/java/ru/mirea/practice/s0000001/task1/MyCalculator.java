package ru.mirea.practice.s0000001.task1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyCalculator extends JFrame {
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    JButton add = new JButton("Addition");
    JButton sub = new JButton("Substraction");
    JButton mult = new JButton("Multiplication");
    JButton div = new JButton("Division");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    MyCalculator() {
        super("Calculator");
        setLayout(new GridLayout(5, 10));
        setSize(350, 350);
        add(new JLabel("1st Number:"));
        add(num1);
        add(new JLabel("2nd Number:"));
        add(num2);
        add(add);
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(num1.getText());
                    double x2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, Double.toString(x1 + x2), "Result", 1);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "CHECK ENTERED NUMBERS", "ERORR", 1);
                }
            }
        });
        add(sub);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(num1.getText());
                    double x2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, Double.toString(x1 - x2), "Result", 1);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "CHECK ENTERED NUMBERS", "ERORR", 1);
                }
            }
        });
        add(mult);
        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(num1.getText());
                    double x2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, Double.toString(x1 * x2), "Result", 1);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "CHECK ENTERED NUMBERS", "ERORR", 1);
                }
            }
        });
        add(div);
        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(num1.getText());
                    double x2 = Double.parseDouble(num2.getText());
                    if (x2 != 0) {
                        JOptionPane.showMessageDialog(null, Double.toString(x1 / x2), "Result", 1);
                    } else {
                        JOptionPane.showMessageDialog(null, "CHECK ENTERED NUMBER 2", "ERORR", 1);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "CHECK ENTERED NUMBERS", "ERORR", 1);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyCalculator();
    }
}
