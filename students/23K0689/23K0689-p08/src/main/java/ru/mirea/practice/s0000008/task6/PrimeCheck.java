package ru.mirea.practice.s0000008.task6;

public final class PrimeCheck {

    private PrimeCheck() {

    }

    public static void main(String[] args) {
        int n = 29; // пример числа
        System.out.println(isPrime(n, 2) ? "YES" : "NO");
    }

    public static boolean isPrime(int n, int divisor) {
        if (n < 2) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
}
