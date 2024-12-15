package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class NumbersFrom1ToN {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
