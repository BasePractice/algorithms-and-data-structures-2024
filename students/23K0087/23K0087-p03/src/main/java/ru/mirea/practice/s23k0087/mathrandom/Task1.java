package ru.mirea.practice.s23k0087.mathrandom;

import java.util.Arrays;
import java.util.Random;

public abstract class Task1 {
    public static void main(String[] args) {
        double[] array1 = createArrayUsingMathRandom(10);
        System.out.println("Массив, созданный с помощью Math.random():");
        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array1));

        System.out.println();

        double[] array2 = createArrayUsingRandomClass(10);
        System.out.println("Массив, созданный с помощью класса Random:");
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array2));
    }

    private static double[] createArrayUsingMathRandom(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static double[] createArrayUsingRandomClass(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}
