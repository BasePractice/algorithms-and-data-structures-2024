package ru.mirea.practice.s23k0135.task1;

import java.util.Stack;

public abstract class RpnCalculator {

    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) { // try-with-resources
            Stack<Double> stack = new Stack<>();

            System.out.println("Введите выражение в обратной польской записи (RPN), разделяя элементы пробелами.  Для выхода введите 'exit'.");

            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) { // Corrected comparison
                    break;
                }

                String[] tokens = input.split("\\s+");
                for (String token : tokens) {
                    try {
                        double num = Double.parseDouble(token);
                        stack.push(num);
                    } catch (NumberFormatException e) {
                        if (isOperator(token)) {
                            double operand2 = stack.pop();
                            double operand1 = stack.pop();
                            double result = performOperation(operand1, operand2, token);
                            stack.push(result);
                        } else {
                            System.out.println("Ошибка: Недопустимый символ: " + token);
                            stack.clear(); //Очищаем стек при ошибке
                            break;
                        }
                    }
                }

                if (!stack.isEmpty()) {
                    System.out.println("Результат: " + stack.peek());
                    stack.clear(); //Очищаем стек после вывода результата (для следующего вычисления)
                }
            }
        } //scanner is automatically closed here.
    }


    private static boolean isOperator(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token); // Corrected comparisons
    }

    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ошибка: Деление на ноль!");
                    return 0; // Или можно бросить исключение
                }
                return operand1 / operand2;
            default:
                return 0; // Не должно достигаться, но добавлено для компилятора
        }
    }
}

