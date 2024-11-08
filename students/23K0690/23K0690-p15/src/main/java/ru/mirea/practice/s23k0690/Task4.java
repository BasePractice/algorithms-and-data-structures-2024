package ru.mirea.practice.s23k0690;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Choice;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class Task4 {

    // Private constructor to prevent instantiation
    private Task4() {}

    public static void main(String[] args) {
        final Frame frame = new Frame("Выбор меню");

        final TextField num1 = new TextField();
        num1.setBounds(50, 50, 100, 20);

        final TextField num2 = new TextField();
        num2.setBounds(160, 50, 100, 20);

        final TextField result = new TextField();
        result.setBounds(50, 100, 210, 20);
        result.setEditable(false);

        Choice operations = new Choice();
        operations.add("Сложение");
        operations.add("Вычитание");
        operations.add("Умножение");
        operations.add("Деление");

        operations.setBounds(50, 130, 210, 30);

        Button calculateButton = new Button("Вычислить");
        calculateButton.setBounds(50, 170, 100, 30);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                String selectedOperation = operations.getSelectedItem();
                double calculationResult = 0;

                switch (selectedOperation) {
                    case "Сложение":
                        calculationResult = number1 + number2;
                        break;
                    case "Вычитание":
                        calculationResult = number1 - number2;
                        break;
                    case "Умножение":
                        calculationResult = number1 * number2;
                        break;
                    case "Деление":
                        if (number2 != 0) {
                            calculationResult = number1 / number2;
                        } else {
                            result.setText("Ошибка: деление на ноль");
                            return;
                        }
                        break;
                    default:
                        result.setText("Ошибка: некорректная операция");
                        return;
                }
                result.setText("Результат: " + calculationResult);
            }
        });

        frame.add(num1);
        frame.add(num2);
        frame.add(result);
        frame.add(operations);
        frame.add(calculateButton);

        frame.setSize(320, 250);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override  // Added @Override annotation
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}