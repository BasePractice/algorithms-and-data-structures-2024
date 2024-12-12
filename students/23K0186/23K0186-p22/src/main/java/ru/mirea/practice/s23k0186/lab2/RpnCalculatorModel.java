package ru.mirea.practice.s23k0145.lab2;

import java.util.ArrayDeque;
import java.util.Deque;

public class RpnCalculatorModel {

    public double evaluateExpression(String expression) {
        Deque<Double> stack = new ArrayDeque<>();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    if (divisor == 0) {
                        throw new ArithmeticException("Деление на ноль.");
                    }
                    double dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default:
                    stack.push(parseNumber(token));
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение.");
        }
        return stack.pop();
    }

    private double parseNumber(String token) {
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный ввод: '" + token + "'.", e);
        }
    }
}
