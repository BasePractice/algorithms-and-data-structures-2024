package ru.mirea.practice.s23k0362;

import java.util.Arrays;
import java.util.Random;

public abstract class Third {
    public static void main(String[] args) {
        Integer[] array = new Integer[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));

        int cmt = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                cmt++;
            }
        }
        if (cmt == array.length) {
            System.out.println("Последовательность строго возрастающая");
        } else {
            System.out.println("Последовательность не строго возрастающая");
        }

    }
}
