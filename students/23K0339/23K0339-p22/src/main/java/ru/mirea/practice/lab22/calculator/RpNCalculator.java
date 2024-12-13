package ru.mirea.practice.lab22.calculator;

import java.util.Stack;

public class RpNCalculator {
    public double evaluate(String expression) {
        if (expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Некорректное выражение: пустая строка");
        }

        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции: " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                stack.push(applyOperation(token, a, b));
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение: " + expression);
        }

        return stack.pop();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double applyOperation(String operator, double a, double b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Некорректный оператор: " + operator);
        }
    }
}
