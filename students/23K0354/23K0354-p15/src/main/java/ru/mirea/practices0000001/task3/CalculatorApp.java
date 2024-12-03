package ru.mirea.practices0000001.task3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class CalculatorApp {
    private static double result = 0;
    private static String operator = "";
    private static boolean calculating = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JTextField display = new JTextField();
        display.setEditable(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener(display));
            panel.add(button);
        }

        frame.add(display, "North");
        frame.add(panel);

        frame.setVisible(true);
    }

    private static class ButtonClickListener implements ActionListener {
        private JTextField display;

        public ButtonClickListener(JTextField display) {
            this.display = display;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (Character.isDigit(command.charAt(0))) {
                if (calculating) {
                    display.setText(command);
                    calculating = false;
                } else {
                    display.setText(display.getText() + command);
                }
            } else if (".".equals(command)) {
                if (!display.getText().contains(".")) {
                    display.setText(display.getText() + ".");
                }
            } else if ("=".equals(command)) {
                calculate(Double.parseDouble(display.getText()));
                display.setText(Double.toString(result));
                operator = "";
                calculating = true;
            } else {
                if (!operator.isEmpty()) {
                    calculate(Double.parseDouble(display.getText()));
                } else {
                    result = Double.parseDouble(display.getText());
                }
                operator = command;
                calculating = true;
            }
        }

        private void calculate(double number) {
            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    if (number != 0) {
                        result /= number;
                    } else {
                        display.setText("Ошибка");
                    }
                    break;
                default:
                    display.setText("Неизвестный оператор");
                    break;
            }
        }
    }
}