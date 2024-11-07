package ru.mirea.practice.s0000001.n3;

import java.util.Arrays;
import java.util.Random;

public final class RandCheck {

    private RandCheck() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(90) + 10;
        }

        System.out.println("Текущий сгенерированный массив: " + Arrays.toString(arr));

        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        if (isStrictlyIncreasing) {
            System.out.println("Такой массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Такой массив не является строго возрастающей последовательностью");
        }
    }
}