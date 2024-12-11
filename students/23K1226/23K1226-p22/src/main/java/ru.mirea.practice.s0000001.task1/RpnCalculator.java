package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.Stack;

public final class RpnCalculator {
    private RpnCalculator() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите выражение в обратной польской нотации: ");
            String expression = scanner.nextLine();
            try {
                double result = evaluateRpn(expression);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static double evaluateRpn(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                double number = Double.parseDouble(token);
                stack.push(number);
            } else {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции");
                }
                double b = stack.pop();
                double a = stack.pop();
                if ("+".equals(token)) {
                    double result = a + b;
                    stack.push(result);
                } else if ("-".equals(token)) {
                    double result = a - b;
                    stack.push(result);
                } else if ("*".equals(token)) {
                    double result = a * b;
                    stack.push(result);
                } else if ("/".equals(token)) {
                    double result = a / b;
                    stack.push(result);
                } else {
                    throw new IllegalArgumentException("Недопустимая операция");
                }
            }
        }
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }
        return stack.pop();
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
