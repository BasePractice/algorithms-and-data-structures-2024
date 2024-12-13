package ru.mirea.practice.s23k0690;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Task2 extends JFrame {
    private JTextField displayField;

    public Task2() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);

        displayField = new JTextField();
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "+", "="};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickHandler());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if ("=".equals(command)) {
                try {
                    String expression = displayField.getText().replaceAll("\\s+", "");
                    String postfixExpression = convertToPostfix(expression);
                    System.out.println("Постфиксное выражение: " + postfixExpression);

                    double calculationResult = evaluatePostfix(postfixExpression);
                    displayField.setText(String.valueOf(calculationResult));
                } catch (Exception ex) {
                    displayField.setText("Ошибка");
                    System.out.println("Ошибка: " + ex.getMessage());
                }
            } else {
                String currentText = displayField.getText();
                displayField.setText(currentText + " " + command);
            }
        }
    }

    public static double evaluatePostfix(String expression) {
        Stack<Double> numberStack = new Stack<>();
        String[] tokens = expression.trim().split(" ");
        System.out.println("Токены: " + String.join(", ", tokens));

        for (String token : tokens) {
            if (isNumeric(token)) {
                double number = Double.parseDouble(token);
                numberStack.push(number);
            } else {
                if (numberStack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции");
                }
                double secondOperand = numberStack.pop();
                double firstOperand = numberStack.pop();
                double operationResult = 0;
                if ("+".equals(token)) {
                    operationResult = firstOperand + secondOperand;
                } else if ("-".equals(token)) {
                    operationResult = firstOperand - secondOperand;
                } else if ("*".equals(token)) {
                    operationResult = firstOperand * secondOperand;
                } else if ("/".equals(token)) {
                    operationResult = firstOperand / secondOperand;
                } else {
                    throw new IllegalArgumentException("Недопустимая операция: " + token);
                }
                numberStack.push(operationResult);
            }
        }

        if (numberStack.size() != 1) {
            throw new IllegalArgumentException("Недопустимое выражение");
        }
        return numberStack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private String convertToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (Character.isDigit(character)) {
                result.append(character).append(" ");
            } else if (character == '(') {
                operatorStack.push(character);
            } else if (character == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    result.append(operatorStack.pop()).append(" ");
                }
                operatorStack.pop();
            } else if (isOperator(character)) {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(character)) {
                    result.append(operatorStack.pop()).append(" ");
                }
                operatorStack.push(character);
            }
        }

        while (!operatorStack.isEmpty()) {
            result.append(operatorStack.pop()).append(" ");
        }

        return result.toString().trim();
    }

    private boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*' || character == '/';
    }

    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        new Task2();
    }
}
