package ru.mirea.practice.s23k0823.task1.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Я откланился от задания тк калоькулятор с gui
// я писал летом для тернировки перед написанием
// системы учёта студентов так что я решил чуть более спортивно :)

public class Calculator extends JFrame {
    private JTextField textField;
    private double number1;
    private double number2;
    private double result;
    private char operation;

    public Calculator() {
        super("Калькулятор");
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        add(panel, BorderLayout.CENTER);

        String[] buttons = {"7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"};

        for (String button : buttons) {
            JButton jButton = new JButton(button);
            jButton.addActionListener(new ButtonListener());
            panel.add(jButton);
        }

        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if ("+".equals(command) || "-".equals(command) || "*".equals(command) || "/".equals(command)) {
                number1 = Double.parseDouble(textField.getText());
                operation = command.charAt(0);
                textField.setText("");
            } else if ("=".equals(command)) {
                number2 = Double.parseDouble(textField.getText());
                switch (operation) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            textField.setText("Ошибка! Деление на ноль.");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Мама я родился");
                }
                textField.setText(String.valueOf(result));
            } else {
                textField.setText(textField.getText() + command);
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}