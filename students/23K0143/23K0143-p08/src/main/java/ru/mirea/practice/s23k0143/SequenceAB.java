package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public abstract class SequenceAB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите A: ");
            int a = scanner.nextInt();

            System.out.print("Введите B: ");
            int b = scanner.nextInt();

            if (a < b) {
                printNumDrowing(a, b);
            } else {
                printNumDescending(a, b);
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printNumDrowing(int a, int b) {
        if (a <= b) {
            System.out.print(a + " ");
            printNumDrowing(a + 1, b);
        }
    }

    public static void printNumDescending(int a, int b) {
        if (a >= b) {
            System.out.print(a + " ");
            printNumDescending(a - 1, b);
        }
    }
}
