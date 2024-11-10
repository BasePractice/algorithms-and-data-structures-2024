package ru.mirea.practice.s23k0823.task1.task1.task2;

import java.util.Stack;

public class RpnCalculatorModel {
    public double evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    double minuend = stack.pop();
                    stack.push(minuend - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    double dividend = stack.pop();
                    if (divisor == 0) {
                        throw new ArithmeticException("Деление на ноль.");
                    }
                    stack.push(dividend / divisor);
                    break;
                default:
                    try {
                        double number = Double.parseDouble(token);
                        stack.push(number);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Неправильный ввод: '" + token + "'.", e);
                    }
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Неправильное выражение.");
        }
        return stack.pop();
    }
}



