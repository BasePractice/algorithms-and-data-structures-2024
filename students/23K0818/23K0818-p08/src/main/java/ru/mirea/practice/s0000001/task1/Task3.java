package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a < b) {
                for (int i = a; i <= b; i++) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = a; i >= b; i--) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}