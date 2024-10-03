package ru.mirea.practice.s23k0145.lab8;

import java.util.Scanner;

public abstract class TriangleSequence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите n: ");
            int n = scanner.nextInt();
            int count = 0;

            for (int i = 1; count < n; i++) {
                for (int j = 0; j < i && count < n; j++) {
                    System.out.print(i + " ");
                    count++;
                }
            }
        }
    }
}

