package ru.mirea.practice.s00000022.task1;

import java.util.Stack;

public class SimpleRpnCalculator {

    public double evaluate(String expression) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    System.out.println("Ошибка: недостаточно операндов для операции.");
                    return Double.NaN;
                }
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(operand1, operand2, token);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            System.out.println("Ошибка: неверное количество операндов в выражении.");
            return Double.NaN;
        }

        return stack.pop();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ошибка: деление на ноль.");
                    return Double.NaN;
                }
                return operand1 / operand2;
            default:
                System.out.println("Неизвестный оператор: " + operator);
                return Double.NaN;
        }
    }
}
