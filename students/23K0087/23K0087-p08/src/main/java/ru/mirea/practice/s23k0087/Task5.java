package ru.mirea.practice.s23k0087;

public abstract class Task5 {
    public static int sumOfNumbers(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfNumbers(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(123456789));
    }
}
