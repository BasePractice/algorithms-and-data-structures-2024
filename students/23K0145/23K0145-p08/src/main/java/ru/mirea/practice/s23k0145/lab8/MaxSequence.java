package ru.mirea.practice.s23k0145.lab8;

import java.util.Scanner;

public abstract class MaxSequence {

    public static int findMax() {
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();

            if (num == 0) {
                return 0; // Конец последовательности
            }

            return Math.max(num, findMax()); // Возвращаем максимальное значение
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите числа последовательности (завершается 0):");
        int max = findMax();
        System.out.println("Максимальное значение последовательности: " + max);
    }
}

