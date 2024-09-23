package ru.mirea.practice.s23k0120.task7;

public abstract class Main {
    public static int factorial(int n) {
        for (int i = n-1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
