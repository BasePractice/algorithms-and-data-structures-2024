package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Random;

/**********************************************************************************
 * Создайте массив из 4 случайных целых чисел из отрезка [10;99],                 *
 * выведите его на экран в строку, далее определите и выведите на экран сообщение *
 * о том, является ли массив строго возрастающей последовательностью.             *
 **********************************************************************************/

public abstract class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; ++i) {
            arr[i] = new Random().nextInt(10, 99);
        }

        System.out.println(Arrays.toString(arr));

        int c = 0;

        for (int i = 0; i < 3; ++i) {
            if (arr[i] > arr[i + 1]) {
                c = 0;
                break;
            } else {
                c++;
            }
        }

        if (c == 3) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
