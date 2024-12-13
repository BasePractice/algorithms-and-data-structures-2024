package ru.mirea.practice.s23k0087.task1;

import java.util.Stack;

public abstract class Calculator {
    private static double applyOperation(double a, double b, String operator) {
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
                throw new IllegalArgumentException("Недопустимый оператор: " + operator);
        }
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    public static double calculate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");
        for (String token : tokens) {
            if (isOperator(token)) {
                double b = stack.pop();
                double a = stack.pop();
                stack.push(applyOperation(a, b, token));
            } else {
                stack.push(Double.parseDouble(token));
            }
        }
        return stack.pop();
    }
}
