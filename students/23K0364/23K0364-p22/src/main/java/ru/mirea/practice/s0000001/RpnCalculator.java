package ru.mirea.practice.s0000001;

import java.util.Stack;

public class RpnCalculator {
    private Stack<Double> stack;

    public RpnCalculator() {
        stack = new Stack<>();
    }

    public double evaluate(String expression) {
        stack.clear();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new ArrayIndexOutOfBoundsException("Ошибка: недостаточно данных для операции");
                }
                double b = stack.pop();
                double a = stack.pop();
                stack.push(applyOperator(a, b, token));
            } else {
                try {
                    stack.push(Double.parseDouble(token));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Ошибка: неверный формат числа", e); // Используем IllegalArgumentException
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalStateException("Ошибка: выражение некорректно");
        }
        return stack.pop();
    }

    private boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private double applyOperator(double a, double b, String operator) {
        try {
            switch (operator) {
                case "+":
                    return a + b;
                case "-":
                    return a - b;
                case "*":
                    return a * b;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Ошибка: деление на ноль");
                    }
                    return a / b;
                default:
                    throw new IllegalArgumentException("Ошибка: неизвестная операция " + operator);
            }
        } catch (ArithmeticException | IllegalArgumentException e) {
            throw e;
        }
    }
}
