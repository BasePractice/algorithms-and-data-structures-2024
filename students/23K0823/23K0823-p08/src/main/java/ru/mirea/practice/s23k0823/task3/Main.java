package ru.mirea.practice.s23k0823.task3;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            printNumbers(a, b);
        }
    }

    public static void printNumbers(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
        } else if (a < b) {
            System.out.print(a + " ");
            printNumbers(a + 1, b);
        } else {
            System.out.print(a + " ");
            printNumbers(a - 1, b);
        }
    }
}