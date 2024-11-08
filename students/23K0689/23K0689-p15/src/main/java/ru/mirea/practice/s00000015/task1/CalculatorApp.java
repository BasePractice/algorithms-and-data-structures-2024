package ru.mirea.practice.s00000015.task1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CalculatorApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(5, 2));

        JTextField number1Field = new JTextField();
        JTextField number2Field = new JTextField();

        JButton addButton = new JButton("Сложить");
        JButton subtractButton = new JButton("Вычесть");
        JButton multiplyButton = new JButton("Умножить");
        final JButton divideButton = new JButton("Разделить");

        JLabel resultLabel = new JLabel("Результат: ");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 + num2;
                resultLabel.setText("Результат: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Результат: " + result);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 * num2;
                resultLabel.setText("Результат: " + result);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultLabel.setText("Результат: " + result);
                } else {
                    resultLabel.setText("Ошибка: Деление на ноль");
                }
            }
        });

        frame.add(new JLabel("Число 1:"));
        frame.add(number1Field);
        frame.add(new JLabel("Число 2:"));
        frame.add(number2Field);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}

