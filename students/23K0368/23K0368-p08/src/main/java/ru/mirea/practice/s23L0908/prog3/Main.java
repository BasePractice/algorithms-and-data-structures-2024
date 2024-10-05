package ru.mirea.practice.s23L0908.prog3;

import java.util.Scanner;

public abstract class Main {
    public static int recursion(int a, int b) {
        if (a == b + 1) {
            return 1;
        } else {
            System.out.printf("%d ",  a);
            return recursion(a + 1, b);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите два числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            recursion(a, b);
        }
    }
}
