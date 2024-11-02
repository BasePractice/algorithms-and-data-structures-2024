package ru.mirea.practice.s23l0908;

import java.util.Arrays;
import java.util.Random;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];

        System.out.println("Array 1 generated using Math.random():");
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100;
            System.out.print(array1[i] + " ");
        }
        Arrays.sort(array1);
        System.out.println("\nSorted array 1 using Math.random():");
        for (double num : array1) {
            System.out.print(num + " ");
        }

        System.out.println("\n---------------------------");

        // Declare array2 closer to its usage
        double[] array2 = new double[size];
        Random random = new Random();
        System.out.println("Array 2 generated using Random class:");
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextDouble() * 100;
            System.out.print(array2[i] + " ");
        }
        Arrays.sort(array2);
        System.out.println("\nSorted array 2 using Random class:");
        for (double num : array2) {
            System.out.print(num + " ");
        }
    }
}

