package ru.mirea.practice.s23k0623;

import java.util.Stack;

public abstract class Main {
    public static double evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+"); // Разделяем выражение по пробелам

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    double subtrahend = stack.pop();
                    stack.push(stack.pop() - subtrahend);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    double divisor = stack.pop();
                    if (divisor == 0) {
                        throw new ArithmeticException("Деление на ноль.");
                    }
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение.");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /";
        try {
            double result = evaluateRpn(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
