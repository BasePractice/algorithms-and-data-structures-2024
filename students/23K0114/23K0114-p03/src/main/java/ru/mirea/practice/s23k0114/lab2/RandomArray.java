package ru.mirea.practice.s23k0114.lab2;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArray {

    public static void main(String[] args) {
        int size = 10;
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        for (int i = 0; i < size; ++i) {
            array1[i] = Math.random();
        }

        Random random = new Random();

        for (int i = 0; i < size; ++i) {
            array2[i] = random.nextDouble();
        }

        System.out.println("Массив с использованием Math.random():");
        System.out.println(Arrays.toString(array1));
        System.out.println("\nМассив с использованием Random:");
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println("\nОтсортированный массив с использованием Math.random():");
        System.out.println(Arrays.toString(array1));
        System.out.println("\nОтсортированный массив с использованием Random:");
        System.out.println(Arrays.toString(array2));
    }
}
