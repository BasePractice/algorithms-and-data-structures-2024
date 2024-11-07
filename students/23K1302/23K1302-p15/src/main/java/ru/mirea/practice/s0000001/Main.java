package ru.mirea.practice.s0000001;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        final Frame f = new Frame("Calculator Example");
        final TextField tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);

        final TextField tf2 = new TextField();
        tf2.setBounds(50, 80, 150, 20);

        final TextField tfResult = new TextField();
        tfResult.setBounds(50, 140, 150, 20);
        tfResult.setEditable(false);

        Button addButton = new Button("+");
        addButton.setBounds(50, 110, 50, 30);

        Button subtractButton = new Button("-");
        subtractButton.setBounds(110, 110, 50, 30);

        Button multiplyButton = new Button("*");
        multiplyButton.setBounds(170, 110, 50, 30);

        Button divideButton = new Button("/");
        divideButton.setBounds(230, 110, 50, 30);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    tfResult.setText(String.valueOf(num1 + num2));
                } catch (NumberFormatException ex) {
                    tfResult.setText("Ошибка ввода");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    tfResult.setText(String.valueOf(num1 - num2));
                } catch (NumberFormatException ex) {
                    tfResult.setText("Ошибка ввода");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    tfResult.setText(String.valueOf(num1 * num2));
                } catch (NumberFormatException ex) {
                    tfResult.setText("Ошибка ввода");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(tf1.getText());
                    double num2 = Double.parseDouble(tf2.getText());
                    if (num2 != 0) {
                        tfResult.setText(String.valueOf(num1 / num2));
                    } else {
                        tfResult.setText("На ноль делить нельзя");
                    }
                } catch (NumberFormatException ex) {
                    tfResult.setText("Ошибка ввода");
                }
            }
        });

        f.add(tf1);
        f.add(tf2);
        f.add(tfResult);
        f.add(addButton);
        f.add(subtractButton);
        f.add(multiplyButton);
        f.add(divideButton);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
