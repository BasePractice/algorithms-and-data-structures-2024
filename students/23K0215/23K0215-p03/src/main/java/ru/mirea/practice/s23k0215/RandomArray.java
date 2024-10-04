package ru.mirea.practice.s23k0215;

import java.util.Arrays;
import java.util.Random;

public final class RandomArray {
    private RandomArray() {

    }

    public static void main(String[] args) {
        // Создаем массив на 10 элементов
        double[] numbersMath = new double[10];


        // Используем Math.random() для заполнения массива
        System.out.println("Массив, сгенерированный с помощью Math.random():");
        for (int i = 0; i < numbersMath.length; i++) {
            numbersMath[i] = Math.random() * 100; // Генерируем случайные числа от 0 до 100
            System.out.print(numbersMath[i] + " ");
        }

        // Сортируем массив и выводим отсортированный массив
        Arrays.sort(numbersMath);
        System.out.println("\nОтсортированный массив (Math.random()):");
        double[] numbersRandom = new double[10];
        for (double num : numbersMath) {
            System.out.print(num + " ");
        }

        // Используем Random для генерации чисел
        Random random = new Random();
        System.out.println("\n\nМассив, сгенерированный с помощью Random:");
        for (int i = 0; i < numbersRandom.length; i++) {
            numbersRandom[i] = random.nextDouble() * 100; // Генерируем случайные числа от 0 до 100
            System.out.print(numbersRandom[i] + " ");
        }

        // Сортируем массив и выводим отсортированный массив
        Arrays.sort(numbersRandom);
        System.out.println("\nОтсортированный массив (Random):");
        for (double num : numbersRandom) {
            System.out.print(num + " ");
        }
    }
}
