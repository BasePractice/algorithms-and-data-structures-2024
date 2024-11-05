package ru.mirea.practice.s23k0140.task4;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            int max = numbers[0];
            int min = numbers[0];

            int i = 0;
            while (i < numbers.length) {
                sum += numbers[i];
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                i++;
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Максимальный элемент массива: " + max);
            System.out.println("Минимальный элемент массива: " + min);
        }
    }
}