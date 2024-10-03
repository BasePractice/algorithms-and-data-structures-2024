package ru.mirea.practice.s23k0140.random;

import java.util.Random;

public abstract class Main {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        boolean vozr = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                vozr = false;
                break;
            }
        }

        if (vozr) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}