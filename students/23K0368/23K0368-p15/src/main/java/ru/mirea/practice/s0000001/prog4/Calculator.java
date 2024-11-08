package ru.mirea.practice.s0000001.prog4;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    private final JTextField textField;
    private final JButton[] numberButtons = new JButton[10];
    private final JButton addButton;
    private final JButton subButton;
    private final JButton mulButton;
    private final JButton divButton;
    private final JButton decButton;
    private final JButton equButton;
    private final JButton clrButton;
    private final JButton delButton;

    private double num1 = 0;
    private double result = 0;
    private char operator;

    public Calculator() {
        setTitle("Калькулятор");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setBounds(30, 25, 240, 40);
        textField.setEditable(false);
        add(textField);

        JPanel panel = new JPanel();
        panel.setBounds(30, 80, 240, 260);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        add(panel);

        // Номера кнопок
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }

        // Функциональные кнопки
        JButton[] functionButtons = new JButton[8];
        functionButtons[0] = addButton = new JButton("+");
        functionButtons[1] = subButton = new JButton("-");
        functionButtons[2] = mulButton = new JButton("*");
        functionButtons[3] = divButton = new JButton("/");
        functionButtons[4] = decButton = new JButton(".");
        functionButtons[5] = equButton = new JButton("=");
        functionButtons[6] = clrButton = new JButton("C");
        functionButtons[7] = delButton = new JButton("Del");

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            panel.add(functionButtons[i]);
        }

        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(decButton);
        panel.add(equButton);
        panel.add(clrButton);
        panel.add(delButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource().equals(numberButtons[i])) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource().equals(decButton)) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource().equals(addButton)) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource().equals(subButton)) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource().equals(mulButton)) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource().equals(divButton)) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource().equals(equButton)) {
            double num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        textField.setText("Ошибка");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource().equals(clrButton)) {
            textField.setText("");
        }
        if (e.getSource().equals(delButton)) {
            String string = textField.getText();
            if (string.length() > 0) {
                textField.setText(string.substring(0, string.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
