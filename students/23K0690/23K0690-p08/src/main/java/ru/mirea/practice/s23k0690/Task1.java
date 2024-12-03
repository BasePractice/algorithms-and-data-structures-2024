package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public final class Task1 {

    private Task1() {}

    private static void prin(int num, int n, int count) {
        if (count >= n) {
            return;
        }

        for (int i = 0; i < num && count < n; i++) {
            System.out.print(num + " ");
            count++;
        }

        prin(num + 1, n, count);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите натуральное число n: ");
            int n = scanner.nextInt();
            prin(1, n, 0);
        }
    }
}