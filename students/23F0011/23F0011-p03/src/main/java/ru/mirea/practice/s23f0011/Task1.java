package ru.mirea.practice.s23f0011;

import java.util.Arrays;
import java.util.Random;

public abstract class Task1 {
    public static void main(String[] args) {
        int n = 10;
        double[] arr1 = new double[n];
        System.out.println("Метод random:");
        for (int i = 0; i < n; i++) {
            arr1[i] = Math.random();
        }
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("\nКласс Random:");
        Random random = new Random();
        double[] arr2 = new double[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = random.nextDouble();
        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
