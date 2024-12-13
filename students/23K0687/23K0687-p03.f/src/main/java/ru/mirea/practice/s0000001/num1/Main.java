package ru.mirea.practice.s0000001.num1;

import java.util.Arrays;
import java.util.Random;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = Math.random() * 100;
            arr2[i] = new Random().nextDouble() * 100;
        }

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Sorted Array 1: " + Arrays.toString(arr1));
        System.out.println("Sorted Array 2: " + Arrays.toString(arr2));
    }
}
