package ru.mirea.practice.s23k0089.task4;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        System.out.println("Задание №4");
        try(Scanner sc = new Scanner(System.in)) {
            int[] arr1 = new int[5];
            int i = 0;
            float sum1 = 0f;
            while (i != 5) {
                System.out.println("Введите ещё значения в количестве " + (5 - i));
                arr1[i] = sc.nextInt();
                sum1 += arr1[i];
                i++;
            }
            int max = arr1[0];
            int min = arr1[0];
            for (i = 1; i < arr1.length; i++) {
                if (max < arr1[i]) {
                    max = arr1[i];
                }
                if (min > arr1[i]) {
                    min = arr1[i];
                }
            }
            System.out.println(Arrays.toString(arr1));
            System.out.println("max = " + max + "\nmin = " + min);
            int[] arr2 = new int[5];
            i = 0;
            float sum2 = 0f;
            do {
                System.out.println("Введите ещё значения в количестве " + (5 - i));
                arr2[i] = sc.nextInt();
                sum2 += arr2[i];
                i++;
            } while (i != 5);
            max = arr2[0];
            min = arr2[0];
            for (i = 1; i < arr2.length; i++) {
                if (max < arr2[i]) {
                    max = arr2[i];
                }
                if (min > arr2[i]) {
                    min = arr2[i];
                }
            }
            System.out.println(Arrays.toString(arr2));
            System.out.println("max = " + max + "\nmin = " + min);
            System.out.println("Сумма элементов I: " + Float.toString(sum1) + "\nСумма элементов II: " + Float.toString(sum2));
        }
    }
}
