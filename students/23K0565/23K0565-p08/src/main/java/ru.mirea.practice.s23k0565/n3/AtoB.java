package ru.mirea.practice.s23k0565.n3;

import java.util.Scanner;

public final class AtoB {

    private AtoB() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a < b) {
                for (int i = a; i <= b; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = a; i >= b; i--) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}