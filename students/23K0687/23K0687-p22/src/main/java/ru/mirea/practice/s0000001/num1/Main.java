package ru.mirea.practice.s0000001.num1;

import java.util.Stack;

public final class Main {
    public static void main(String[] args) {
        String[] e = {"2", "3", "+", "5", "*"};
        double r = evaluateReversePolishNotation(e);
        System.out.println("Результат: " + r);
    }

    public static double evaluateReversePolishNotation(String[] e) {
        Stack<Double> s = new Stack<>();
        for (String t : e) {
            if (isNum(t)) {
                s.push(Double.parseDouble(t));
            } else {
                double b = s.pop();
                double a = s.pop();
                double res = applyOp(a, b, t);
                s.push(res);
            }
        }
        return s.pop();
    }

    public static boolean isNum(String t) {
        try {
            Double.parseDouble(t);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static double applyOp(double a, double b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Неизвестный оператор: " + op);
        }
    }

    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }
}
