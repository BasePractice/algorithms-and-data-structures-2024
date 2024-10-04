package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class FromOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}