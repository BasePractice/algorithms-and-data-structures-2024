package ru.mirea.practice.s0000001.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArrayUtil {
    public static void main(String[] args) {
        int arraySize = 10;
        double[] randomArray1 = new double[arraySize];
        double[] randomArray2 = new double[arraySize];

        for (int index = 0; index < arraySize; ++index) {
            randomArray1[index] = Math.random();
        }

        Random randomGenerator = new Random();

        for (int index = 0; index < arraySize; ++index) {
            randomArray2[index] = randomGenerator.nextDouble();
        }

        System.out.println("Массив, созданный с помощью Math.random(): ");
        System.out.println(Arrays.toString(randomArray1));
        System.out.println("Массив, созданный с использованием Random: ");
        System.out.println(Arrays.toString(randomArray2));

        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        System.out.println("Отсортированный массив, полученный с помощью Math.random():");
        System.out.println(Arrays.toString(randomArray1));
        System.out.println("Отсортированный массив, полученный с использованием Random:");
        System.out.println(Arrays.toString(randomArray2));
    }
}