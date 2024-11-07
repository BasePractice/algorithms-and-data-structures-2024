package ru.mirea.practice.s0000001;

public abstract class Task7 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал числа " + number + " равен " + factorial(number));
    }
}