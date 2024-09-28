package ru.mirea.practice.s23k0112;

import java.util.Arrays;
import java.util.Random;

public final class Task11 {
    private Task11() {

    }

    public static void main(String[] args) {
        int length = 10;
        double[] arr = new double[length];

        for (int i = 0; i < length; i++) {
            arr[i] = Math.random();
        }

        System.out.println("Unsorted array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        double[] arr2 = new double[length]; // Changed variable name from arr_2 to arr2 for camelCase
        Random rand = new Random();

        for (int i = 0; i < length; i++) {
            arr2[i] = rand.nextInt(10);
        }
        System.out.println("\nUnsorted array with Random class: " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted array with Random class: " + Arrays.toString(arr2));
    }
}