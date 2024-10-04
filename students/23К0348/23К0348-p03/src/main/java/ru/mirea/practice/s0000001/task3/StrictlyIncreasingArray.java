package ru.mirea.practice.s0000001.task3;

import java.util.Random;

public class StrictlyIncreasingArray {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10; // Случайные числа от 10 до 99
        }

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        boolean isStrictlyIncreasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                isStrictlyIncreasing = false;
                break;
            }
        }

        System.out.println("\nМассив является строго возрастающей последовательностью: " + isStrictlyIncreasing);
    }
}
