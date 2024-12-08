package ru.mirea.practice.s23k0116.task1;

import java.util.Stack;

public abstract class Calculator {

    // Метод для вычисления выражения в обратной польской нотации
    public static double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

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
                    double dividend = stack.pop();
                    if (divisor == 0) {
                        throw new ArithmeticException("Деление на ноль");
                    }
                    stack.push(dividend / divisor);
                    break;
                default:
                    // Попробуем распарсить число
                    try {
                        stack.push(Double.parseDouble(token));
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Некорректный токен: " + token, e);
                    }
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        return stack.pop();
    }

    // Пример использования
    public static void main(String[] args) {
        String rpnExpression = "3 4 + 2 * 7 /"; // (3 + 4) * 2 / 7
        try {
            double result = evaluate(rpnExpression);
            System.out.println("Результат выражения '" + rpnExpression + "': " + result);
        } catch (Exception e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        }

        // Дополнительный пример
        String anotherExpression = "5 1 2 + 4 * + 3 -"; // 5 + ((1 + 2) * 4) - 3
        try {
            double result = evaluate(anotherExpression);
            System.out.println("Результат выражения '" + anotherExpression + "': " + result);
        } catch (Exception e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        }
    }
}
