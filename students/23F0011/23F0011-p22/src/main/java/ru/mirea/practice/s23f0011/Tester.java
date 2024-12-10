package ru.mirea.practice.s23f0011;

import java.util.EmptyStackException;

public abstract class Tester {
    public static void main(String[] args) {
        RpnCalc calculator = new RpnCalc(10);

        System.out.println("5 2 + = " + calculator.evaluate("5 2 +"));
        System.out.println("3 7 - = " + calculator.evaluate("3 7 -"));
        System.out.println("5 7 * = " + calculator.evaluate("5 7 *"));
        System.out.println("1 5 / = " + calculator.evaluate("1 5 /"));
        System.out.println("8 3 + 1 * = " + calculator.evaluate("8 3 + 1 *"));

        try {
            System.out.println("5 0 / = " + calculator.evaluate("10 0 /"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("1 + = " + calculator.evaluate("1 +"));
        } catch (EmptyStackException e) {
            System.out.println("Невозможно убрать элемент из начала у пустого стека");
        }

        try {
            System.out.println("6 2 % = " + calculator.evaluate("6 2 %"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
