package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArray {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        double[] array1 = new double[size];
        double[] array2 = new double[size];

        // Заполнение массива с использованием Math.random()
        for (int i = 0; i < size; i++) {
            array1[i] = Math.random() * 100; // Случайное число от 0 до 100
        }

        // Заполнение массива с использованием класса Random
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            array2[i] = rand.nextDouble() * 100; // Случайное число от 0 до 100
        }

        // Вывод массивов на экран
        System.out.println("Массив 1 (Math.random()): " + Arrays.toString(array1));
        System.out.println("Массив 2 (Random class): " + Arrays.toString(array2));

        // Сортировка массивов
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Вывод отсортированных массивов на экран
        System.out.println("Отсортированный массив 1: " + Arrays.toString(array1));
        System.out.println("Отсортированный массив 2: " + Arrays.toString(array2));
    }
}
