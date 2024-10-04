package ru.mirea.practice.s23k0565.n5;

import java.util.Scanner;

public final class SumD {

    private SumD() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(sumDigits(n));
        }
    }

    private static int sumDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumDigits(num / 10);
        }
    }
}