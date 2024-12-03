package ru.mirea.practice.s23k0164;

import java.util.Scanner;

public final class Four {

    private Four() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.printf("Введите элемент %d: ", i + 1);
                arr[i] = scanner.nextInt();
            }

            int min = arr[0];
            int max = arr[0];
            int sum = 0;
            int i = 0;

            while (i < arr.length) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
                sum += arr[i];
                i++;
            }

            System.out.println("\nМассив: ");
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
            System.out.println("\nМинимальное значение: " + min);
            System.out.println("Максимальное значение: " + max);
            System.out.println("Сумма элементов: " + sum);

        }
    }
}
