package ru.mirea.practice.s23l0908;

import java.util.Scanner;

public final class Task7 {

    private Task7() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            long result = giaithua(n);
            System.out.print("Result: " + result);
        }
    }

    public static long giaithua(int n) {
        if (n < 0) {
            System.out.println("Cannot calculate factorial for negative numbers!");
            return -1;
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }
}

