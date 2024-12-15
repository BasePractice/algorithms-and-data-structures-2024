package ru.mirea.practice.s0000001.task1;

import java.util.ArrayDeque;
import java.util.Deque;

public abstract class Pln {
    private static boolean isOperate(String token) {
        return "+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token) || "^".equals(token);
    }

    private static double operationChoose(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("INFINITY");
                }
                return a / b;
            default: return Double.NaN;
        }
    }

    public static double calculateSmth(String... args) {
        Deque<Double> st = new ArrayDeque<>();
        for (String one : args) {
            try {
                double temp = Double.parseDouble(one);
                st.push(temp);
            } catch (NumberFormatException e) {
                if (isOperate(one)) {
                    if (st.size() < 2) {
                        System.err.println("too litle amount of opearnds: " + one);
                        return Double.NaN;
                    }
                    double x = st.pop();
                    double y = st.pop();
                    try {
                        st.push(operationChoose(y, x, one));
                    } catch (ArithmeticException ae) {
                        System.err.println("error: ");
                        return Double.NaN;
                    }
                } else {
                    System.err.println("uncorrect symbol: " + one);
                    return Double.NaN;
                }
            } catch (Exception e) {
                System.err.println("incorrect symbols");
                return Double.NaN;
            }
        }

        if (st.size() != 1) {
            System.err.println("error");
            return Double.NaN;
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String[] a = {"2", "3", "*", "4", "5", "*", "+"};
        String[] b = {"2", "3", "4", "5", "6", "*", "+", "-", "/"};
        System.out.println(calculateSmth(a));
        System.out.println(calculateSmth(b));
    }
}

