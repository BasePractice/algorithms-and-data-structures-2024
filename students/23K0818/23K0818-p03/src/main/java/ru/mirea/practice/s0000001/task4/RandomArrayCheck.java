package ru.mirea.practice.s0000001.task4;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArrayCheck {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Generated array: " + Arrays.toString(array));

        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("The array is strictly increasing.");
        } else {
            System.out.println("The array is not strictly increasing.");
        }
    }
}