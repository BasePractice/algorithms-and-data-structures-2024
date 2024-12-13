package ru.mirea.practice.s23k0690;

import java.util.Stack;

public final class Task1 {

    private Task1() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static double evaluaterpn(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new Exception("Недостаточно операндов");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                try {
                    double number = Double.parseDouble(token);
                    stack.push(number);
                } catch (NumberFormatException e) {
                    throw new Exception("Неверный формат числа: " + token, e);
                }
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Некорректное выражение");
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token);
    }

    private static double applyOperator(String operator, double a, double b) throws Exception {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new Exception("Деление на ноль");
                }
                return a / b;
            default:
                throw new Exception("Неверный оператор: " + operator);
        }
    }

    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /";
        try {
            double result = evaluaterpn(expression);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
