package ru.mirea.practice.s23k0087;

public abstract class Task7 {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testNumbers = {0, 5, 10, -10};
        for (int testNumber : testNumbers) {
            System.out.println("Факториал " + testNumber + " = " + factorial(testNumber));
        }
    }
}

