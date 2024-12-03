package ru.mirea.practice.lab8.task5;

public abstract class SumOfNumberDigits {

    public static int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sumOfDigits(n));
    }
}
