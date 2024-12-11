package ru.mirea.practice.s23k0623;

import java.util.Scanner;

public abstract class NumbersFromOneToN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите натуральное число n: ");
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
