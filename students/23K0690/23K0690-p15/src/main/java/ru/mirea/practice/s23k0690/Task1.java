package ru.mirea.practice.s23k0690;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public final class Task1 {

    private Task1() {}

    public static void main(String[] args) {
        final Frame f = new Frame("Калькулятор");
        final TextField num1 = new TextField();
        num1.setBounds(50, 70, 150, 20);
        final TextField num2 = new TextField();
        num2.setBounds(200, 70, 150, 20);
        final TextField result = new TextField();
        result.setBounds(100, 120, 200, 20);
        result.setEditable(false);

        Button addButton = new Button("Сложить");
        addButton.setBounds(50, 150, 60, 30);
        Button subtractButton = new Button("Вычесть");
        subtractButton.setBounds(120, 150, 60, 30);
        Button multiplyButton = new Button("Умножить");
        multiplyButton.setBounds(190, 150, 60, 30);
        Button divideButton = new Button("Разделить");
        divideButton.setBounds(260, 150, 80, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                double sum = number1 + number2;
                result.setText("Результат: " + sum);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                double difference = number1 - number2;
                result.setText("Результат: " + difference);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                double product = number1 * number2;
                result.setText("Результат: " + product);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double number1 = Double.parseDouble(num1.getText());
                double number2 = Double.parseDouble(num2.getText());
                if (number2 != 0) {
                    double quotient = number1 / number2;
                    result.setText("Результат: " + quotient);
                } else {
                    result.setText("ERROR: Нельзя делить на ноль :(");
                }
            }
        });

        f.add(num1);
        f.add(num2);
        f.add(result);
        f.add(addButton);
        f.add(subtractButton);
        f.add(multiplyButton);
        f.add(divideButton);
        f.setSize(400, 230);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}