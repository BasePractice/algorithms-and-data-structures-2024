package ru.mirea.practice.s23k0823.task1.task1.task1;

import java.util.Scanner;
import java.util.Stack;

public abstract class RpnCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите выражение в формате RPN (например, '2 3 +'):");

            String input = scanner.nextLine();
            try {
                double result = evaluateRpn(input);
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
