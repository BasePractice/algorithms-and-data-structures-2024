package ru.mirea.practice.s23f0011;

import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        System.out.println("Задание 4");
        double inf = Double.POSITIVE_INFINITY;
        int n = 10;
        int i = 0;
        double mx = -inf;
        double mn = inf;
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = new int[n];
            System.out.println("Введите элементы в массив:");
            while (i < n) {
                arr[i] = sc.nextInt();
                if (arr[i] > mx) {
                    mx = arr[i];
                }
                if (arr[i] < mn) {
                    mn = arr[i];
                }
                i++;
            }
        }
        System.out.println("Максимальный элемент в массиве: " + mx);
        System.out.println("Минимальный элемент в массиве: " + mn);
    }
}
