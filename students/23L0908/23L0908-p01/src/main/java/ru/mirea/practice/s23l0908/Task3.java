package ru.mirea.practice.s23l0908;

import java.util.Scanner;

public final class Task3 {
    private Task3() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.print("arr[" + (i + 1) + "] = ");
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            double average = (double) sum / n;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
}
