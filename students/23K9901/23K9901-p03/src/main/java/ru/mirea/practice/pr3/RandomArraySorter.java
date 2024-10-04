package ru.mirea.practice.pr3;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArraySorter {

    public static void main(String[] args) {
        int size = 10;
        double[] mathArray = new double[size];

        for (int i = 0; i < size; i++) {
            mathArray[i] = Math.random();
        }

        System.out.println("Массив, сгенерированный через Math.random():");
        System.out.println(Arrays.toString(mathArray));

        Arrays.sort(mathArray);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(mathArray));

        double[] randomArray = new double[size];
        Random randomGenerator = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = randomGenerator.nextDouble();
        }

        System.out.println("Массив, сгенерированный через Random:");
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));
    }
}
