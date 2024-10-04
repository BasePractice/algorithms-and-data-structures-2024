package ru.mirea.practice.s23k0145.lab3;

import java.util.Arrays;
import java.util.Random;

public abstract class First {
    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        final double[] array2 = new double[size];

        // Генерация с помощью Math.random()
        System.out.println("Array using Math.random():");
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
            System.out.printf("%.2f ", array1[i]);
        }
        System.out.println();

        Arrays.sort(array1);
        System.out.println("Sorted array using Math.random(): " + Arrays.toString(array1));

        // Генерация с помощью Random
        Random random = new Random();
        System.out.println("\nArray using Random class:");
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
            System.out.printf("%.2f ", array2[i]);
        }
        System.out.println();

        Arrays.sort(array2);
        System.out.println("Sorted array using Random: " + Arrays.toString(array2));
    }
}

