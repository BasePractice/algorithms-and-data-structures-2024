package ru.mirea.practice.s23L0908;

import java.util.Arrays;
import java.util.Scanner;

/********************************************************************
 * Напишите программу, которая меняет местами элементы              *
 * одномерного массива из String в обратном порядке. Не используйте *
 * дополнительный массив для хранения результатов.                  *
 ********************************************************************/

public abstract class Task8 {
    public static void main(String[] args) {
        String[] arr = new String[10];

        System.out.println("Введите 10 строк.");
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; ++i) {
                System.out.println("Введите строку №" + (i + 1) + ": ");

                arr[i] = sc.nextLine();
            }

            System.out.println("Изначальный массив: " + Arrays.toString(arr));

            for (int i = 0; i < 5; ++i) {
                String tmp = arr[i];
                arr[i] = arr[9 - i];
                arr[9 - i] = tmp;
            }

            System.out.println("Изменённый массив: " + Arrays.toString(arr));
        }
    }
}
