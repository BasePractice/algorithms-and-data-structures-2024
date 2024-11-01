package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public final class Task2 {

    private Task2() {}

    private static void prin(int n, int con) {
        if (con >= n) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(con + " ");
            con++;
        }
        prin(n, con);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите натуральное число n: ");
            int n = scanner.nextInt();
            prin(n, 1);
        }
    }
}