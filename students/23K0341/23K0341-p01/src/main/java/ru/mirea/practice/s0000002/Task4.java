package ru.mirea.practice.s0000002;

import java.util.Arrays;
import java.util.Scanner;

/*******************************************************************************
 * Написать программу, в результате которой массив чисел вводится              *
 * пользователем с клавиатуры считается сумма элементов целочисленного         *
 * массива с помощью циклов do while, while, также необходимо найти            *
 * максимальный и минимальный элемент в массиве, результат выводится на экран. *
 *******************************************************************************/

public abstract class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int[] minMax = new int[2];

        System.out.println("Практическая работа №1\nЗадание №4");
        System.out.println("1. Введите 5 целых числовых значений.");

        int i = 0;
        while (i < 5) {
            System.out.print("Введите целое число №" + (1 + i) + ": ");
            try (Scanner sc = new Scanner(System.in)) {
                int numba = sc.nextInt();

                arr[i] = numba;

                if (i == 0) {
                    minMax[0] = numba;
                    minMax[1] = numba;
                } else {

                    if (numba > minMax[1]) {
                        minMax[1] = numba;
                    }

                    if (numba < minMax[0]) {
                        minMax[0] = numba;
                    }

                }

                sum += numba;

                ++i;
            }
        }

        do {
            System.out.print("Введите целое число №" + (1 + i) + ": ");
            try (Scanner sc = new Scanner(System.in)) {
                int numba = sc.nextInt();
                arr[i] = numba;
                if (numba > minMax[1]) {
                    minMax[1] = numba;
                }

                if (numba < minMax[0]) {
                    minMax[0] = numba;
                }

                sum += numba;

                ++i;
            }
        } while (i < arr.length);

        System.out.println("Массив:\n" + Arrays.toString(arr));
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Минимальное значение массива: " + minMax[0]);
        System.out.println("Максимальное значение массива: " + minMax[1]);
    }
}
