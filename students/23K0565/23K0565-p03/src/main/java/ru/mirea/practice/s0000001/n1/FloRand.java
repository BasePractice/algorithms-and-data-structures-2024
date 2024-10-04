package ru.mirea.practice.s0000001.n1;

import java.util.Arrays;
import java.util.Random;

public final class FloRand {
    private FloRand() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        int n = 10;
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * 100;
        }

        System.out.println("Массив с Math.random(): " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));

        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextDouble() * 100;
        }

        System.out.println("Массив с Random: " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}