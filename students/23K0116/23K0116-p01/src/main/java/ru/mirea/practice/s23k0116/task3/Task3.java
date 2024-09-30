package ru.mirea.practice.s23k0116.task3;

import java.util.Scanner;

public abstract class Task3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            int sum = 0;
            double arifMean;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }

            arifMean = (double) sum / array.length;

            System.out.println(sum + "\n" + arifMean);
        }
    }
}
