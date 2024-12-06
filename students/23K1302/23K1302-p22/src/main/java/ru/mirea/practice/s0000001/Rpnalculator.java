package ru.mirea.practice.s0000001;

import java.util.Stack;
import java.util.Scanner;

public final class Rpnalculator {

    private Rpnalculator() {
        // 456
    }

    public static double evaluaterpn(String expression) {
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
                    stack.push(Double.parseDouble(token));
                    break;
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Выражение некорректно");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("Введите выражение:");
                String input = scanner.nextLine();

                try {
                    double result = evaluaterpn(input);
                    System.out.println("Результат: " + result);
                } catch (Exception e) {
                    System.err.println("Ошибка: " + e.getMessage());
                }
            }
        } finally {
            scanner.close();
        }
    }
}
