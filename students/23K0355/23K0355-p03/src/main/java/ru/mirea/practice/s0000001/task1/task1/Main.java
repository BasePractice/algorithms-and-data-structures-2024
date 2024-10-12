package ru.mirea.practice.s0000001.task1.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        int sz = 10;

        double[] arr1 = new double[sz];
        for (int j = 0; j < sz; j++) {
            arr1[j] = Math.random();
        }

        System.out.println("Массив, сгенерированный с использованием Math.random():");
        printArray(arr1);

        Arrays.sort(arr1);

        System.out.println("Отсортированный массив:");
        printArray(arr1);

        double[] arr2 = new double[sz];
        Random rnd = new Random();
        for (int j = 0; j < sz; j++) {
            arr2[j] = rnd.nextDouble();
        }

        System.out.println("Массив, сгенерированный с использованием класса Random:");
        printArray(arr2);

        Arrays.sort(arr2);

        System.out.println("Отсортированный массив:");
        printArray(arr2);
    }

    public static void printArray(double[] arr) {
        for (double num : arr) {
            System.out.printf("  %.2f ", num);
        }
        System.out.println();
    }
}