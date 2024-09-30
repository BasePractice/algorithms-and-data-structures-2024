package ru.mirea.practice.s23k0116.random;

import java.util.Random;
import java.util.Arrays;

public abstract class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        double[] array1 = new double[10];
        double[] array2 = new double[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = rand.nextDouble();
            array2[i] = Math.random();
        }

        System.out.printf("Array by rand.nextDouble(): %s\n", Arrays.toString(array1));
        System.out.printf("Array by Math.random(): %s\n", Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.printf("Sorted array by rand.nextDouble(): %s\n", Arrays.toString(array1));
        System.out.printf("Sorted array by Math.random(): %s\n", Arrays.toString(array2));
    }

}
