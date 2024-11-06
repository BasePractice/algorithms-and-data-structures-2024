package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public final class Task3 {

    private Task3() {}

    public static void num(int a, int b, int c, int max) {
        if (c == max) {
            return;
        }

        if (a <= b) {
            System.out.print(a + " ");
            num(a + 1, b, c + 1, max);
        } else {
            System.out.print(a + " ");
            num(a - 1, b, c + 1, max);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int max = 0;

            if (a > b) {
                max = a;
            } else {
                max = b;
            }

            num(a, b, 0, max);
        }
    }
}