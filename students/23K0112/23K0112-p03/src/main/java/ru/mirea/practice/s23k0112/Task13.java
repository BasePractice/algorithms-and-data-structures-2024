package ru.mirea.practice.s23k0112;

import java.util.Arrays;
import java.util.Random;

public final class Task13 {
    private Task13() {

    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        int flag = 1;
        int prev = 0;

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(100 - 10) + 10;
            if (arr[i] < prev) {
                flag = 0;
            }
            prev = arr[i];
        }

        if (flag == 1) {
            System.out.println("The array is increasing: " + Arrays.toString(arr));
        } else {
            System.out.println("The array is not increasing: " + Arrays.toString(arr));
        }
    }
}
