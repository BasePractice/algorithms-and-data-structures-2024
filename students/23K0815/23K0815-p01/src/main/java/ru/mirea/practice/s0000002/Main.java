package ru.mirea.practice.s0000002;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        System.out.println("Задача 3:");
        int[] numbers1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;

        for (int value : numbers1) {
            sum1 += value;
        }

        double average = (double) sum1 / (double) numbers1.length;
        System.out.println("Сумма: " + sum1);
        System.out.println("Среднее арифметическое: " + average);
        System.out.println("Задача 4:");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество элементов массива: ");
            int n = scanner.nextInt();
            int[] numbers2 = new int[n];
            System.out.println("Введите элементы массива:");

            int sum2;
            for (sum2 = 0; sum2 < n; ++sum2) {
                numbers2[sum2] = scanner.nextInt();
            }

            sum2 = 0;
            int min = numbers2[0];
            int max = numbers2[0];
            int i = 0;

            do {
                sum2 += numbers2[i];
                if (numbers2[i] < min) {
                    min = numbers2[i];
                }

                if (numbers2[i] > max) {
                    max = numbers2[i];
                }

                ++i;
            } while (i < n);

            System.out.println("Сумма: " + sum2);
            System.out.println("Минимум: " + min);
            System.out.println("Максимум: " + max);
            System.out.println("Задача 5: ");

            int j;
            for (j = 0; j < args.length; ++j) {
                System.out.println("Аргумент " + j + ": " + args[j]);
            }

            System.out.println("Задача 6:");
            System.out.printf("%-10s %-10s\n", "N", "Harmonic Number");

            for (j = 1; j <= 10; ++j) {
                double harmonic = 0.0;

                for (int k = 1; k <= j; ++k) {
                    harmonic += 1.0 / (double) k;
                }

                System.out.printf("%-10d %-10.5f\n", j, harmonic);
            }

            System.out.println("Задача 7: ");
            System.out.print("Введите число для вычисления факториала: ");
            j = scanner.nextInt();
            System.out.println("Факториал " + j + " = " + calculateFactorial(j));
        }
    }

    public static int calculateFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }
        return factorial;
    }
}