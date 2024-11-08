package ru.mirea.practice.s0000001.task1.task1.task2;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.print(i + " ");
            }
        }
    }
}