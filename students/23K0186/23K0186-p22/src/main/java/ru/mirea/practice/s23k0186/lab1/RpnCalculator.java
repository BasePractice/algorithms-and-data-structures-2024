package ru.mirea.practice.s23k0145.lab1;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public final class RpnCalculator {

    private RpnCalculator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите выражение в обратной польской записи (например, '2 3 +'):");
            String input = scanner.nextLine();

            try {
                double result = calculateRpn(input);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static double calculateRpn(String expression) {
        Deque<Double> stack = new ArrayDeque<>();
        String[] tokens = expression.trim().split("\\s+");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    checkStackSize(stack, 2);
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    checkStackSize(stack, 2);
                    double b = stack.pop();
                    double a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    checkStackSize(stack, 2);
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    checkStackSize(stack, 2);
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

    private static double parseNumber(String token) {
        try {
            return Double.parseDouble(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный ввод: '" + token + "'.", e);
        }
    }

    private static void checkStackSize(Deque<Double> stack, int requiredSize) {
        if (stack.size() < requiredSize) {
            throw new IllegalArgumentException("Недостаточно операндов в стеке для выполнения операции.");
        }
    }
}

