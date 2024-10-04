package ru.mirea.practice.u23k1158.t4;

import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            int sum = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            System.out.println("Введите элементы массива:");
            int i = 0;
            while (i < size) {
                array[i] = scanner.nextInt();
                i++;
            }
            int j = 0;
            do {
                sum += array[j];
                if (array[j] > max) {
                    max = array[j]; // Обновляем макс
                }
                if (array[j] < min) {
                    min = array[j]; // Обновляем мин
                }
                j++;
            } while (j < size);

            System.out.println("Сумма элементов:" + sum);
            System.out.println("Мин элемент:" + min);
            System.out.println("Макс элемент:" + max);
        }
    }
}
