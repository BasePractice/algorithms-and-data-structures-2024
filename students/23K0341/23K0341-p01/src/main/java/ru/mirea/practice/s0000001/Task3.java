package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Scanner;

/*************************************************************************
 * Написать программу, в результате которой массив чисел создается с     *
 * помощью инициализации (как в Си) вводится и считается в цикле сумма   *
 * элементов целочисленного массива, а также среднее арифметическое его  *
 * элементов результат выводится на экран. Использовать цикл for.        *
 *************************************************************************/

public abstract class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;


        System.out.println("Практическая работа №1\nЗадание №3");
        System.out.println("Введите 10 целых числовых значений.");

        for (int i = 0; i < arr.length; ++i) {
            try (Scanner sc = new Scanner(System.in)) {
                System.out.print("Введите целое число №" + (1 + i) + ": ");
                int numba = sc.nextInt();
                arr[i] = numba;

                sum += numba;
            }
        }

        System.out.println("Массив:\n" + Arrays.toString(arr));
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее значение: " + sum / arr.length);
    }
}
