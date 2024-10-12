package ru.mirea.practice.s0000001.task1.task1.task1;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите натуральное число n: ");
            int n = sc.nextInt();

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