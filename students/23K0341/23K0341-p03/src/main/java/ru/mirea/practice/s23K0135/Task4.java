package ru.mirea.practice.s23K0135;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**********************************************************************************
 * Пользователь должен ввести с клавиатуры размер массива -                       *
 * натуральное число больше, так чтобы введенное пользователем число              *
 * сохранялось в переменную n. Если пользователь ввел не подходящее число, то     *
 * программа должна просить пользователя повторить ввод. Создать массив из n      *
 * случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй *
 * массив только из четных элементов первого массива, если они там есть, и        *
 * вывести его на экран.                                                          *
 **********************************************************************************/

public abstract class Task4 {
    public static void main(String[] args) {

        System.out.print("Введите n (n > 1): ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            while (n < 2) {
                System.out.print("Попробуйте снова (n > 1): ");
                n = sc.nextInt();
            }
            int[] arr = new int[n];
            int ch = 0;

            for (int i = 0; i < n; ++i) {
                arr[i] = new Random().nextInt(n);
                if (arr[i] % 2 == 0) {
                    ch++;
                }
            }

            int[] chet = new int[ch];

            for (int i = 0, j = 0; i < n; ++i) {
                if (arr[i] % 2 == 0) {
                    chet[j++] = arr[i];
                }
            }

            System.out.println(Arrays.toString(arr));
            if (ch > 0) {
                System.out.println(Arrays.toString(chet));
            }
        }
    }
}
