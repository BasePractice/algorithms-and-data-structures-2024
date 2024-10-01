package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Введите элементы массива   :");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            int totalSum = 0;
            int max = numbers[0];
            int min = numbers[0];

            int i = 0;
            do {
                totalSum += numbers[i];
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                i++;
            } while (i < size);

            System.out.println("Сумма элементов массива: " + totalSum);
            System.out.println("Максимальный элемент массива: " + max);
            System.out.println("Минимальный элемент массива: " + min);
        }
    }
}