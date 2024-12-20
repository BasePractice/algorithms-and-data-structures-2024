package ru.mirea.practice.s0000001;

abstract class Main {
    public static void main(String[] args) {
        String rpnExpression = "3 4 + 2 * 7 /";
        double result = RpnCalculator.calculate(rpnExpression);
        System.out.println("Результат: " + result);
    }
}
