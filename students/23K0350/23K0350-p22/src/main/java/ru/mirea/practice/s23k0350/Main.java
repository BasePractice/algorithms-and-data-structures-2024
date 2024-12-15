package ru.mirea.practice.s23k0350;

abstract class Main {
    public static void main(String[] args) {
        String expression = "2 3 * 4 5 * + ";
        RpnCalculator rp =  new RpnCalculator(expression);
        System.out.println("Результат: " + rp.evaluate(expression));
    }
}

