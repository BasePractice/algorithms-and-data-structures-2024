package ru.mirea.practice.s23k0690;

import java.util.Arrays;

public final class Task1mathandrandom {

    // Private constructor to prevent instantiation
    private Task1mathandrandom() {
        throw new UnsupportedOperationException("Utility class should not be instantiated");
    }

    public static void main(String[] args) {
        double[] ar = new double[10];
        System.out.println("Метод random() класса Math");
        System.out.println("Не отсортированный массив:");

        for (int i = 0; i < 10; i++) {
            ar[i] = Math.random() * 100;
        }

        printArray(ar);

        System.out.println("Отсортированный массив:");
        Arrays.sort(ar);
        printArray(ar);

        java.util.Random gen = new java.util.Random();

        for (int i = 0; i < 10; i++) {
            ar[i] = gen.nextDouble() * 100;
        }

        System.out.println("Метод random() класс Random");
        System.out.println("Не отсортированный массив:");
        printArray(ar);

        System.out.println("Отсортированный массив:");
        Arrays.sort(ar);
        printArray(ar);
    }

    private static void printArray(double[] array) {
        for (double v : array) {
            System.out.println(v);
        }
    }
}