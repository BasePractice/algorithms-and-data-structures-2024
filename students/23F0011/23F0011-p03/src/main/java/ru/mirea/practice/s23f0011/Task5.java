package ru.mirea.practice.s23f0011;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Task5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = 0;
            while (n <= 0) {
                System.out.println("Введите натуральное число");
                while (!sc.hasNextInt()) {
                    System.out.println("Введите натуральное число!");
                    sc.next();
                }
                n = sc.nextInt();
            }
            int[] arr1 = new int[n];
            Random random = new Random();
            for (int i = 0; i < n; i++) {
                arr1[i] = random.nextInt(n);
            }
            System.out.println(Arrays.toString(arr1));

            int[] arr2 = new int[n];
            boolean isEmpty = true;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (arr1[i] % 2 == 0) {
                    arr2[j++] = arr1[i];
                    isEmpty = false;
                }
            }
            if (isEmpty) {
                System.out.println("В первом массиве нет четных чисел");
            } else {
                System.out.println(Arrays.toString(arr2));
            }
        }
    }
}
