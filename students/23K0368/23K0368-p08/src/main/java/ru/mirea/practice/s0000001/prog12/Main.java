package ru.mirea.practice.s0000001.prog12;

import java.util.Scanner;

public abstract class Main {
    public static void nechetNumbers() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pleas enter number ");
            int n = scanner.nextInt();
            if (n != 0) {
                if (n % 2 != 0) {
                    System.out.println("Great! You number is odd numbers" + n);
                    nechetNumbers();
                } else {
                    nechetNumbers();
                }
            }
        }

    }

    public static void main(String[] arg) {
        nechetNumbers();
    }
}
