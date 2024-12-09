package ru.mirea.practice.s23k0164.t1;

import java.util.Stack;

public final class RpnCalculator {
    private RpnCalculator() {

    }

    public static void main(String[] args) {
        String expression = "3 4 + 2 * 7 /";

        try {
            double result = evaluateRpn(expression);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static double evaluateRpn(String expression) throws Exception {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expression.split("\\s+");

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                if (stack.size() < 2) {
                    throw new Exception("Invalid expression: insufficient values in stack.");
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = performOperation(a, b, token);
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new Exception("Invalid expression: too many values in stack.");
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

    private static double performOperation(double a, double b, String operator) throws Exception {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new Exception("Division by zero.");
                }
                return a / b;
            default:
                throw new Exception("Invalid operator: " + operator);
        }
    }
}
