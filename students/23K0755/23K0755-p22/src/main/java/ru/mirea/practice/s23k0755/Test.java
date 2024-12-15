package ru.mirea.practice.s23k0755;

public abstract class Test {
    public static void main(String[] args) {
        RpnCalculator calculator = new RpnCalculator(10);
        System.out.println("16.1 3.9 + = " + calculator.evaluate("16.1 3.9 +"));
        System.out.println("8 4 - = " + calculator.evaluate("8 4 -"));
        System.out.println("28 0.5 * = " + calculator.evaluate("28 0.5 *"));
        System.out.println("7 2 / = " + calculator.evaluate("7 2 /"));
        System.out.println("3 4 + 2 * = " + calculator.evaluate("3 4 + 2 *"));

        try {
            System.out.println("38 0 / = " + calculator.evaluate("38 0 /"));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
