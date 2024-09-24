package ru.mirea.practice.s23k0143;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomTask3 {
    public static void main(String[] args) {
        double[] arr = new double[4];

        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            arr[i] = random.nextDouble(89) + 10;
        }
        System.out.println("\nМассив, заполненный с использованием класса Random:");
        System.out.println(Arrays.toString(arr));
        boolean flag = true;
        for (int i = 1; i < 4; i++) {
            if (arr[i - 1] > arr[i]) {flag = false;}
        }
        if (flag) {
            System.out.println("Массив является строго возрастающим.");
        } else {System.out.println("Массив не является строго возрастающим.");}
    }
}
