package ru.mirea.practice.s23k0089.random;

import java.util.Arrays;
import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] array1 = new double[10];
        double[] array2 = new double[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Math.random();
            array2[i] = random.nextDouble();
        }

        System.out.printf("Math.Random array: %s\n", Arrays.toString(array1));
        System.out.printf("random.nextDouble() array: %s\n", Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.printf("Math.Random sorted array: %s\n", Arrays.toString(array1));
        System.out.printf("random.nextDouble() sorted array: %s\n", Arrays.toString(array2));
    }
}
