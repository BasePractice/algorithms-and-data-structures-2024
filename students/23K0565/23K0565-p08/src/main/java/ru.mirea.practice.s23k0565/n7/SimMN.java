package ru.mirea.practice.s23k0565.n7;

import java.util.Scanner;

public final class SimMN {

    private SimMN() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            factorize(n, 2);
        }
    }

    private static void factorize(int num, int divisor) {
        if (num < 2) {
            return;
        }
        if (num % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(num / divisor, divisor);
        } else {
            factorize(num, divisor + 1);
        }
    }
}