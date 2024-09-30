package ru.mirea.practice.lab1;

import java.util.Scanner;

public abstract class Proj4 {
    public static void main(String[] args) {
        final int length = 5;
        int sumOne = 0;
        int sumTwo = 0;
        int[] arr = new int[length];
        int i = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (i < length) {
                if (sc.hasNextInt()) {
                    arr[i] = sc.nextInt();
                    i++;
                } else {
                    System.out.println("Вы ввели не целое число, перезапустите программу.");
                    sc.close();
                    System.exit(-1);
                }
            }
        }
        int minEl = arr[0];
        int maxEl = arr[0];
        int x = 0;
        while (x < length) {
            sumOne += arr[x];
            if (minEl > arr[x]) {
                minEl = arr[x];
            }
            x++;
        }
        int z = 0;
        do {
            sumTwo += arr[z];
            if (maxEl < arr[z]) {
                maxEl = arr[z];
            }
            z++;
        } while (z < length);
        System.out.println("Первая сумма - " + sumOne + "\nВторая сумма - " + sumTwo);
        System.out.println("Минимальный элемент - " + minEl + "\nМаксимальный элемент - " + maxEl);
    }
}
