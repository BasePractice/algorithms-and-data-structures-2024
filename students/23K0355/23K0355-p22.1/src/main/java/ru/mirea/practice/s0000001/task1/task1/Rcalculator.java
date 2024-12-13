package ru.mirea.practice.s0000001.task1.task1;

import java.util.Scanner;

public final class Rcalculator {

    private Rcalculator() {}

    static class St {
        private double[] d;
        private int s;

        public St(int c) {
            d = new double[c];
            s = 0;
        }

        public void pop(double v) {
            if (s >= d.length) {
                throw new StackOverflowError("Stack overflow");
            }
            d[s++] = v;
        }

        public double po() {
            if (s == 0) {
                throw new IllegalStateException("Stack is empty");
            }
            return d[--s];
        }

        public int si() {
            return s;
        }
    }

    public static double ev(String exp) {
        St st = new St(100);
        String[] t = exp.split(" ");

        for (String tok : t) {
            if (isNum(tok)) {
                st.pop(Double.parseDouble(tok));
            } else {
                double b = st.po();
                double a = st.po();
                double r = op(a, b, tok);
                st.pop(r);
            }
        }

        return st.po();
    }

    private static boolean isNum(String tok) {
        try {
            Double.parseDouble(tok);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double op(double a, double b, String o) {
        switch (o) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unsupported operator: " + o);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите выражение в обратной польской нотации (например, '3 4 + 2 *'): ");
            String exp = sc.nextLine();

            try {
                double res = ev(exp);
                System.out.println("Результат: " + res);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Ошибка при работе с вводом: " + e.getMessage());
        }
    }
}
