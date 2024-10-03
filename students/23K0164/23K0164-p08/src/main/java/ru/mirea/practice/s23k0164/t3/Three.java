package ru.mirea.practice.s23k0164.t3;

import java.util.Scanner;

public final class Three {

    private Three() {

    }

    private static void outputOfNumbers(int a, int b) {
        if (a == b) {
            return;
        }
        if (a < b) {
            System.out.print(a + " ");
            if (a < b) {
                outputOfNumbers(a + 1, b);
            }
        } else {
            System.out.print(a + " ");
            if (a > b) {
                outputOfNumbers(a - 1, b);
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число А:");
            int a = scanner.nextInt();
            System.out.println("Введите число B:");
            int b = scanner.nextInt();
            outputOfNumbers(a, b);
        }
    }
}
