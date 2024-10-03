package ru.mirea.practice.s25k0112;

public final class PrimeFactors {
    private PrimeFactors() {

    }

    public static void printPrimeFactors(int n, int divisor) {
        if (n < 2) {
            return;
        }
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            printPrimeFactors(n / divisor, divisor);
        } else {
            printPrimeFactors(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        int n = 21;
        printPrimeFactors(n, 2);
    }
}
