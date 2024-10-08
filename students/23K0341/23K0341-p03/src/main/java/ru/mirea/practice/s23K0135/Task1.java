package ru.mirea.practice.s23K0135;

import java.util.Random;

/***********************************************************************************
 * Создать массив вещественных чисел случайным образом, вывести его                *
 * на экран, отсортировать его, и снова вывести на экран (использовать два подхода *
 * к генерации случайных чисел – метод random() класса Math и класс Random)        *
 ***********************************************************************************/

public abstract class Task1 {
    public static void main(String[] args) {

        Random rng = new Random();

        double[] arr = new double[rng.nextInt(90) + 10];

        for (int i = 0; i < arr.length / 2; ++i) {
            arr[i] = Math.random() * 10000;
            arr[i] -= arr[i] - Math.floor(arr[i]);
            arr[i] /= 100;
            String val = (i + 1) % 15 == 0 || i + 1 == arr.length ? "\n" : " | ";
            System.out.print(arr[i] + val);
        }
        for (int i = arr.length / 2; i < arr.length; ++i) {
            arr[i] = rng.nextDouble() * 100;
            arr[i] -= arr[i] - Math.floor(arr[i]);
            arr[i] /= 100;
            String val = (i + 1) % 15 == 0 || i + 1 == arr.length ? "\n" : " | ";
            System.out.print(arr[i] + val);
        }

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    double tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; ++i) {
            String val = (i + 1) % 15 == 0 || i + 1 == arr.length ? "\n" : " | ";
            System.out.print(arr[i] + val);
        }
    }
}
