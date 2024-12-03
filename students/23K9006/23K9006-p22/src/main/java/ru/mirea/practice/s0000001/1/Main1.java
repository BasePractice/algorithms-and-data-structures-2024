package ru.mirea.practice.s0000001;

abstract class Main1 {
    public static void main(String[] args) {
        String rpnExpression = "3 4 + 2 * 7 /";
        double result = RPnCalculator.calculate(rpnExpression);
        System.out.println("Результат: " + result);
    }
}
