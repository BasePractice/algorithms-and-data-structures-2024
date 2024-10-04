package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / array.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива:");
            int n = scanner.nextInt();
            int[] userArray = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                userArray[i] = scanner.nextInt();
            }

            sum = 0;
            int index = 0;
            do {
                sum += userArray[index];
                index++;
            } while (index < n);
            System.out.println("Сумма элементов (do-while): " + sum);

            int min = userArray[0];
            int max = userArray[0];
            index = 1;
            while (index < n) {
                if (userArray[index] < min) {
                    min = userArray[index];
                }
                if (userArray[index] > max) {
                    max = userArray[index];
                }
                index++;
            }
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);

            System.out.println("Аргументы командной строки:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }

            System.out.println("Первые 10 чисел гармонического ряда:");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("H%d = %.4f%n", i, 1.0 / i);
            }

            System.out.println("Введите число для вычисления факториала:");
            int number = scanner.nextInt();
            System.out.println("Факториал " + number + " = " + factorial(number));
        } finally {
            scanner.close();
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}