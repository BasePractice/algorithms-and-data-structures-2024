package ru.mirea.practice.s0000001.task2;

import java.util.Stack;

public class CalculatorModel {

    public String calculate(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split(" ");

        try {
            for (String token : tokens) {
                if (isNumber(token)) {
                    stack.push(Double.parseDouble(token));
                } else {
                    double b = stack.pop();
                    double a = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(a + b);
                            break;
                        case "-":
                            stack.push(a - b);
                            break;
                        case "*":
                            stack.push(a * b);
                            break;
                        case "/":
                            stack.push(a / b);
                            break;
                        default:
                            throw new IllegalArgumentException("Недопустимая операция");
                    }
                }
            }
            return String.valueOf(stack.pop());
        } catch (Exception e) {
            return "Ошибка";
        }
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
