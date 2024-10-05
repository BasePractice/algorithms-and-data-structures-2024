package ru.mirea.practice.s23L0908;

import java.util.Random;

public abstract class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90);
        }
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("\nМассив строго возрастающий.");
        } else {
            System.out.println("\nМассив не является строго возрастающим.");
        }
    }
}
