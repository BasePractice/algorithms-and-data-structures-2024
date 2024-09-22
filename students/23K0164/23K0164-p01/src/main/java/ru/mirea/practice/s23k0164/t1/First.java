package ru.mirea.practice.s23k0164.t1;

import java.util.Random;
import java.util.Scanner;

public final class First {

    private First(){

    }

    public static void insertionSort(double[] sortArr) {
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            double swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            double[] arr = new double[size];
            System.out.println("Введите размер массива 2-ого:");
            int size2 = scanner.nextInt();
            double[] arr2 = new double[size2];
            Random rand = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextDouble();
            }
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = Math.random();
            }

            System.out.println("Сгенерированный массив с помощью Random:");
            for (double num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nСгенерированный массив с помощью RandomMath:");
            for (double num : arr2) {
                System.out.print(num + " ");
            }
            insertionSort(arr);
            insertionSort(arr2);

            System.out.println("\nОтсортированный массив:");
            for (double num : arr) {
                System.out.print(num + " ");
            }
            System.out.println("\nОтсортированный массив:");
            for (double num : arr2) {
                System.out.print(num + " ");
            }
        }
    }
}
