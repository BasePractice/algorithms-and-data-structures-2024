package ru.mirea.practice.s0000008.task5;

public final class SumDigits {

    private SumDigits() {

    }

    public static void main(String[] args) {
        int n = 12345; // пример числа
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }
}