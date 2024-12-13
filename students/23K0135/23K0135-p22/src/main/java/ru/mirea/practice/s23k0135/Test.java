package ru.mirea.practice.s23k0135;

import java.util.EmptyStackException;

public abstract class Test {
    public static void main(String[] args) {
        RpnCalculator calculator = new RpnCalculator(10);

        System.out.println("7 3 + = " + calculator.evaluate("7 3 +"));
        System.out.println("4 9 - = " + calculator.evaluate("4 9 -"));
        System.out.println("6 8 * = " + calculator.evaluate("6 8 *"));
        System.out.println("2 4 / = " + calculator.evaluate("2 4 /"));
        System.out.println("9 2 + 3 * = " + calculator.evaluate("9 2 + 3 *"));

        try {
            System.out.println("10 0 / = " + calculator.evaluate("10 0 /"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("1 + = " + calculator.evaluate("1 +"));
        } catch (EmptyStackException e) {
            System.out.println("Невозможно убрать элемент в начале пустого стека");
        }

        try {
            System.out.println("18 9 % = " + calculator.evaluate("18 9 %"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
