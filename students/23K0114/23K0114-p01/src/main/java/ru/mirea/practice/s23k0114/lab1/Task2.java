package ru.mirea.practice.s23k0114.lab1;

import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Размер массива -> ");
            int n = in.nextInt();
            int[] arr = new int[n];
            int i = 0;
            int max = 0;
            int min = 10000000;
            while (i < arr.length) {
                arr[i] = in.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
                i++;
            }
            in.close();
            int sum = 0;
            i = 0;
            do {
                sum += arr[i];
                i++;
            } while (i < arr.length);
            System.out.println("Сумма -> " + sum);
            System.out.println("Maximum -> " + max);
            System.out.println("Minimum -> " + min);
        }
    }
}