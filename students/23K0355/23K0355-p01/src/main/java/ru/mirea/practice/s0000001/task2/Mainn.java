package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public final class Mainn {

    private Mainn() {}

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите разгмер массива: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            int i = 0;
            do {
                sum += numbers[i];
                i++;
            } while (i < size);

            int max = numbers[0];
            int min = numbers[0];
            i = 1;
            while (i < size) {
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