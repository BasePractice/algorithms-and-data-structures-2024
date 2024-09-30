package ru.mirea.practice.s23k0823.mathrandom;

import java.util.Random;
import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            int n;

            while (true) {
                System.out.print("Введите размер массива (натуральное число > 0): ");
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) {
                        break;
                    } else {
                        System.out.println("Неверный ввод. Пожалуйста, введите натуральное число, большее 0.");
                    }
                } else {
                    System.out.println("Неверный ввод. Пожалуйста, введите натуральное число, большее 0.");
                    scanner.next();
                }
            }

            Random random = new Random();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(n + 1);
            }

            System.out.print("Массив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();

            int[] evenArray = new int[n];
            int evenCount = 0;
            for (int num : array) {
                if (num % 2 == 0) {
                    evenArray[evenCount++] = num;
                }
            }
            int[] evenArrayTrimmed = new int[evenCount];
            System.arraycopy(evenArray, 0, evenArrayTrimmed, 0, evenCount);


            if (evenCount > 0) {
                System.out.print("Четный массив: ");
                for (int num : evenArrayTrimmed) {
                    System.out.print(num + " ");
                }
                System.out.println();
            } else {
                System.out.println("В массиве нет четных элементов.");
            }
        }
    }
}
