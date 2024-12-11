package ru.mirea.practice.s23k0565.n9;

import java.util.Scanner;

public final class Z00 {

    private Z00() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(countSequences(a, b));
        }
    }

    private static int countSequences(int zeros, int ones) {
        if (zeros > ones + 1) {
            return 0;
        }
        if (zeros == 0 || ones == 0) {
            return 1;
        }
        return countSequences(zeros - 1, ones - 1) + countSequences(zeros, ones - 1);
    }
}