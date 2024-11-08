package ru.mirea.practice.s23k0135.task5;

import java.util.Scanner;

public abstract class Task5 {
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n;

            // Ввод размера массива с проверкой
            do {
                System.out.print("Введите размер массива: ");
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Некорректный ввод. Введите натуральное число больше 0.");
                }
            } while (n <= 0);

            int[] array1 = new int[n];
            for (int i = 0; i < n; i++) {
                array1[i] = (int) (Math.random() * (n + 1)); // Случайные числа от 0 до n
            }

            System.out.println("Первый массив:");
            printArray(array1);

            // Массив только из четных чисел
            int evenCount = 0;
            for (int element : array1) {
                if (element % 2 == 0) {
                    evenCount++;
                }
            }
            int[] array2 = new int[evenCount];
            int j = 0;
            for (int element : array1) {
                if (element % 2 == 0) {
                    array2[j] = element;
                    j++;
                }
            }

            // Вывод второго массива на экран
            System.out.println("\nВторой массив (четные числа):");
            printArray(array2);
        }
    }
}
