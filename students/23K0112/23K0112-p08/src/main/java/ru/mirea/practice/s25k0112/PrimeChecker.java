package ru.mirea.practice.s25k0112;

public final class PrimeChecker {
    private PrimeChecker() {

    }

    public static boolean isPrime(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int n = 7;
        boolean prime = isPrime(n, 2);

        if (prime) {
            System.out.println("n = " + n + " is prime");
        } else {
            System.out.println("n = " + n + " is not prime");
        }

    }
}


