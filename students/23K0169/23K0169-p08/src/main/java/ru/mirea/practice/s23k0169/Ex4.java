package ru.mirea.practice.s23k0169;

public final class Ex4 {

    private Ex4() {

    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println("Сумма цифр числа: " + sumOfDigits(n));
    }
}
