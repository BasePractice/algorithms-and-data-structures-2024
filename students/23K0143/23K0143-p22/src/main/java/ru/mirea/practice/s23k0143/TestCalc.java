package ru.mirea.practice.s23k0143;

import java.util.EmptyStackException;

public abstract class TestCalc {
    public static void main(String[] args) {
        RpnCalculator calculator = new RpnCalculator(10);

        System.out.println("1 2 + = " + calculator.evaluate("1 2 +"));
        System.out.println("5 1 - = " + calculator.evaluate("5 1 -"));
        System.out.println("3 4 * = " + calculator.evaluate("3 4 *"));
        System.out.println("10 2 / = " + calculator.evaluate("10 2 /"));
        System.out.println("3 4 + 2 * = " + calculator.evaluate("3 4 + 2 *"));

        try {
            System.out.println("10 0 / = " + calculator.evaluate("10 0 /"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("1 + = " + calculator.evaluate("1 +"));
        } catch (EmptyStackException e) {
            System.out.println("Невозможно выполнить POP для пустого стека");
        }

        try {
            System.out.println("5 3 % = " + calculator.evaluate("5 3 %"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
