package ru.mirea.practice.s23k0143;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomTask1 {
    public static void main(String[] args) {
        double[] arr1 = new double[10];
        double[] arr2 = new double[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = Math.random() * 100;
        }
        System.out.println("Массив, заполненный с использованием Math.random():");
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr1));

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr2[i] = random.nextDouble() * 100;
        }
        System.out.println("\nМассив, заполненный с использованием класса Random:");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(arr2));
    }
}
