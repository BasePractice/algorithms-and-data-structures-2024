package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        }
    }
}
