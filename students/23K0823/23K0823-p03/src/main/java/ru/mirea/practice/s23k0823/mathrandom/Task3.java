package ru.mirea.practice.s23k0823.mathrandom;

import java.util.Random;

public abstract class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = random.nextInt(90) + 10;
        }


        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        boolean isIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив представляет собой строго возрастающую последовательность.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}