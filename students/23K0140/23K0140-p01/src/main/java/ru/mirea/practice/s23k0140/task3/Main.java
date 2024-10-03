package ru.mirea.practice.s23k0140.task3;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] numbers = new int[size];

            int sum = 0;
            double average;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элемент " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
                sum += numbers[i];
            }

            average = (double) sum / numbers.length;

            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое элементов массива: " + average);
        }
    }
}