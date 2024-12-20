package ru.mirea.practice.s23k0087.task1;

public abstract class Tester {
    public static void main(String[] args) {
        String expression = "4 8 - 2 / 7 *";
        System.out.println("Calculating ((4 - 8) / 2) * 7");
        double result = Calculator.calculate(expression);
        System.out.println("Result: " + result);
    }
}
