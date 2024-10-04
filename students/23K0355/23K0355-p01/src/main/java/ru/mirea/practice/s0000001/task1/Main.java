package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите количество элементов: ");
            int count = input.nextInt();

            int[] arr = new int[count];

            System.out.println("Введите элементы:");
            for (int j = 0; j < count; j++) {
                arr[j] = input.nextInt();
            }

            int total = 0;
            double average;

            for (int value : arr) {
                total += value;
            }

            average = (double) total / arr.length;

            System.out.println("Сумма: " + total);
            System.out.println("Среднее: " + average);
        }
    }
}