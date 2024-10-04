package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * Задание от 1 до n
 * Дано натуральное число n. Выведите все числа от 1 до n.
 */

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            printer(n);
        }
    }

    private static void printer(int max) {
        if (max < 1) {
            return;
        }
        printer(1, max);
    }

    public static void printer(int cur, int max) {
        if (cur == max) {
            return;
        }
        System.out.println(cur);
        printer(cur + 1, max);
    }
}
