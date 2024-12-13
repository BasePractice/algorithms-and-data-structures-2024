package ru.mirea.practice.s230k754.lab11.task1;

import java.util.Scanner;
import java.util.Stack;

final class Task1 {
    private Task1() {}

    public static double algo(String expression) {
        // Разделим строку с большими пробелами
        String[] str = expression.split("\\s+");
        Stack<Double> stack = new Stack<>();

        for (String t1 : str) {
            try {
                double num = Double.parseDouble(t1);
                stack.push(num);
            } catch (NumberFormatException e) {
                switch (t1) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-": {
                        double operand2 = stack.pop();
                        double operand1 = stack.pop();
                        stack.push(operand1 - operand2);
                        break;
                    }
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/": {
                        double operand2 = stack.pop();
                        double operand1 = stack.pop();
                        if (operand2 == 0) {
                            System.out.println("Деление на 0");
                            System.exit(1);
                        }
                        stack.push(operand1 / operand2);
                        break;
                    }
                    default:
                        System.out.println("Неизвестная операция");
                        System.exit(1);
                        break;
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            try {
                double result = algo(input);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
