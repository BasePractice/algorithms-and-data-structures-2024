package ru.mirea.practice.s23k0169.math.t1;

import java.util.Arrays;
import java.util.Random;

public final class RandomArray {

    private RandomArray() {

    }

    public static void main(String[] args) {
        int size = 10;
        double[] randomNumbers = new double[size];

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = Math.random() * 100;
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(randomNumbers));

        Arrays.sort(randomNumbers);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomNumbers));

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = random.nextDouble() * 100;
        }

        System.out.println("Новый исходный массив:");
        System.out.println(Arrays.toString(randomNumbers));

        Arrays.sort(randomNumbers);

        System.out.println("Отсортированный новый массив:");
        System.out.println(Arrays.toString(randomNumbers));
    }

}
