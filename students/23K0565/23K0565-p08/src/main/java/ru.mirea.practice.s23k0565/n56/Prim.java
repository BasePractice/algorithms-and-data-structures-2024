package ru.mirea.practice.s23k0565.n56;

import java.util.Scanner;

public final class Prim {

    private Prim() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (isPrime(n, 2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isPrime(int num, int div) {
        if (num < 2) {
            return false;
        }
        if (div * div > num) {
            return true;
        }
        if (num % div == 0) {
            return false;
        }
        return isPrime(num, div + 1);
    }
}