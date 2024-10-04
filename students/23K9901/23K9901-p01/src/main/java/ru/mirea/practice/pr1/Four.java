package ru.mirea.practice.pr1;

import java.util.Scanner;

public abstract class Four {
    public static void main(String[] args) {
        int number;
        int[] numbers;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов в массиве: ");
            number = scanner.nextInt();
            numbers = new int[number];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < number; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            int i = 0;
            do {
                sum += numbers[i];
                i++;
            } while (i < number);

            i = 1;
            while (i < number) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                i++;
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Максимальный элемент: " + max);
            System.out.println("Минимальный элемент: " + min);
        }
    }
}
