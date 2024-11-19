package ru.mirea.practice.s23f0011;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JPanel buttons = new JPanel();
    JPanel textFields = new JPanel();
    JButton buttonSum = new JButton("Сумма");
    JButton buttonMult = new JButton("Умножение");
    JButton buttonSubs = new JButton("Вычитание из второго первое");
    JButton buttonDiv = new JButton("Деление первое на второе");
    Font fnt = new Font("Times new roman", Font.BOLD, 25);

    Calculator() {
        super("Example");
        setLayout(new FlowLayout());
        textFields.setLayout(new GridLayout(2, 2));
        textFields.add(new JLabel("Первое число"));
        textFields.add(jta1);
        textFields.add(new JLabel("Второе число"));
        textFields.add(jta2);
        add(textFields);
        setSize(500, 300);
        buttons.setLayout(new GridLayout(2, 2));
        buttons.add(buttonSum);
        buttons.add(buttonSubs);
        buttons.add(buttonMult);
        buttons.add(buttonDiv);
        add(buttons);

        buttonSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                buttonAction(Action.SUM);
            }
        });

        buttonMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                buttonAction(Action.MULTIPLY);
            }
        });

        buttonSubs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                buttonAction(Action.SUBTRACT);
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                buttonAction(Action.DIVIDE);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void buttonAction(Action action) {
        double result = 0f;
        try {
            double x1 = Double.parseDouble(jta1.getText().trim());
            double x2 = Double.parseDouble(jta2.getText().trim());
            switch (action) {
                case SUM: {
                    result = x1 + x2;
                    break;
                }
                case SUBTRACT: {
                    result = x1 - x2;
                    break;
                }
                case MULTIPLY: {
                    result = x1 * x2;
                    break;
                }
                case DIVIDE: {
                    result = x1 / x2;
                    break;
                }
                default: {
                    result = 0;
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "Ответ = " + result, "Ответ", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Ошибка!", "Alert", JOptionPane.ERROR_MESSAGE);
        }
    }

    private enum Action {
        SUM, SUBTRACT, MULTIPLY, DIVIDE
    }
}
