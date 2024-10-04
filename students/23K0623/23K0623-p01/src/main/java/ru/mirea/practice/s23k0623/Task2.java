package ru.mirea.practice.s23k0623;

import java.util.Scanner;

public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] numbers = new int[size];

            System.out.println("Введите элементы массива:");
            int i = 0;
            do {
                numbers[i] = scanner.nextInt();
                i++;
            } while (i < size);

            int sum = 0;
            int min = numbers[0];
            int max = numbers[0];

            i = 0;
            while (i < size) {
                sum += numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                i++;
            }

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Минимальный элемент: " + min);
            System.out.println("Максимальный элемент: " + max);
        }



    }
}


