package ru.mirea.practice.s0000001.num3;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }
}
