package ru.mirea.practice.s23k0565.n2;

import java.util.Scanner;

public final class OnetoN {

    private OnetoN() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}