package ru.mirea.practice.s23k0823.mathrandom;

import java.util.Arrays;
import java.util.Random;

public abstract class Task1 {
    public static void main(String[] args) {
        int size = 10;
        float[] array = new float[size];

        for (int i = 0; i < size; i++) {
            array[i] = (float) (Math.random() * 100);
        }

        System.out.println("Оригинальный массив (Math.random()):");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Отсортированный массив (Math.random()):");
        System.out.println(Arrays.toString(array));

        Random random = new Random();
        float[] array2 = new float[size];
        for (int i = 0; i < size; i++) {
            array2[i] = random.nextFloat() * 100;
        }

        System.out.println("Оригинальный массив (класс Random):");
        System.out.println(Arrays.toString(array2));

        Arrays.sort(array2);

        System.out.println("Отсортированный массив (класс Random):");
        System.out.println(Arrays.toString(array2));
    }
}
