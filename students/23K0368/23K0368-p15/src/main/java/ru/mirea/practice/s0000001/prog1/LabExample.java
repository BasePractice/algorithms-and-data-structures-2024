package ru.mirea.practice.s0000001.prog1;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton buttonAdd = new JButton("Add");
    JButton buttonSubtract = new JButton("Subtract");
    JButton buttonMultiply = new JButton("Multiply");
    JButton buttonDivide = new JButton("Divide");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250, 200);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);

        // Добавляем кнопки
        add(buttonAdd);
        add(buttonSubtract);
        add(buttonMultiply);
        add(buttonDivide);

        // Добавляем слушателей к кнопкам
        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('+');
            }
        });
        buttonSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('-');
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('*');
            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                calculate('/');
            }
        });

        setVisible(true);
    }

    private void calculate(char operation) {
        try {
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());

            String result;
            switch (operation) {
                case '+':
                    result = "Result = " + (x1 + x2);
                    break;
                case '-':
                    result = "Result = " + (x1 - x2);
                    break;
                case '*':
                    result = "Result = " + (x1 * x2);
                    break;
                case '/':
                    if (x2 == 0) {
                        JOptionPane.showMessageDialog(null, "Division by zero is not allowed!",
                            "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    result = "Result = " + (x1 / x2);
                    break;
                default:
                    result = "Invalid operation!";
                    break;
            }

            JOptionPane.showMessageDialog(null, result, "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LabExample();
    }
}
