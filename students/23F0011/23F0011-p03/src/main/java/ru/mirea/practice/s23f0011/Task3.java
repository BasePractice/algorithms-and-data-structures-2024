package ru.mirea.practice.s23f0011;

import java.util.Arrays;
import java.util.Random;

public abstract class Task3 {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(90) + 10;
        }

        System.out.println(Arrays.toString(arr));

        boolean vozr = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                vozr = false;
                break;
            }
        }

        if (vozr) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}
