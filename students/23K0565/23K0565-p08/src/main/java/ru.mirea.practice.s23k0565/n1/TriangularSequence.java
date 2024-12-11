package ru.mirea.practice.s23k0565.n1;

import java.util.Scanner;

public final class TriangularSequence {

    private TriangularSequence() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count = 0;

            for (int i = 1; count < n; i++) {
                for (int j = 0; j < i && count < n; j++) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
    }
}