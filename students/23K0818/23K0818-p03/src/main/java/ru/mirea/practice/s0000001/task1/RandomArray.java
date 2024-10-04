package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArray {
    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; i++) {
            array1[i] = Math.random();
            array2[i] = new Random().nextDouble();
        }

        System.out.println("Array generated with Math.random():");
        System.out.println(Arrays.toString(array1));

        System.out.println("Array generated with Random.nextDouble():");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println("Sorted array generated with Math.random():");
        System.out.println(Arrays.toString(array1));

        System.out.println("Sorted array generated with Random.nextDouble():");
        System.out.println(Arrays.toString(array2));
    }
}
