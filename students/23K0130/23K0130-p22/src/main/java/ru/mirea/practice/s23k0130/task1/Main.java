package ru.mirea.practice.s23k0130.task1;

abstract class Main {
    public static void main(String[] args) {
        String rpnExpression = "3 9 + 4 * 2 /";
        double result = RPncalculator.calculate(rpnExpression);
        System.out.println("Результат: " + result);
    }
}
