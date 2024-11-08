package ru.mirea.practice.s23k1167.task1;

import java.util.Scanner;
import java.util.Stack;

public abstract class RpnCalculator {

    public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();

        // Разделяем входную строку на элементы
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
                    stack.push(dividend / divisor);
                    break;
                default:
                    // Если токен не оператор, то предполагаем, что это число
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        // Результат будет единственным элементом в стеке
        return stack.pop();
    }

    public static void main(String[] args) {
        // Используем try-with-resources для безопасного закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите выражение в обратной польской нотации (RPN): ");

            String expression = scanner.nextLine();

            if (expression != null && !expression.trim().isEmpty()) {
                try {
                    double result = evaluate(expression);
                    System.out.println("Результат: " + result);
                } catch (Exception e) {
                    System.out.println("Ошибка: " + e.getMessage());
                }
            } else {
                System.out.println("Вы не ввели выражение.");
            }
        }
    }
}
