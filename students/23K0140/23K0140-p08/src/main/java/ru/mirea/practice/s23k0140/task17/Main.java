package ru.mirea.practice.s23k0140.task17;

import java.util.Scanner;

public abstract class Main {
    public static int findMax() {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n == 0) {
                return 0;
            }
            int maxi = findMax();
            return Math.max(n, maxi);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (0 для завершения):");
        System.out.println("Максимум: " + findMax());
    }
}
