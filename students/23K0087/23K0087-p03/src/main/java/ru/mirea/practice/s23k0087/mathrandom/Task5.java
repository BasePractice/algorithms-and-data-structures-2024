package ru.mirea.practice.s23k0087.mathrandom;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Task5 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            n = sc.nextInt();
            while (n <= 0) {
                System.out.println("Ошибка ввода! Введите корректный размер массива: ");
                n = sc.nextInt();
            }
        } catch (RuntimeException e) {
            throw e;
        }
        int[] arr = new int[n];
        int[] evenArr = new int[0];
        int j = 0;
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                evenArr = Arrays.copyOf(evenArr, evenArr.length + 1);
                evenArr[j] = arr[i];
                j++;
            }
        }
        if (j != 0) {
            System.out.println("\nМассив чётных чисел: " + Arrays.toString(evenArr));
        }
    }
}
