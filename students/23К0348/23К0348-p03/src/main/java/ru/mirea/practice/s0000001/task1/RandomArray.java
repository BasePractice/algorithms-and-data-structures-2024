package ru.mirea.practice.s0000001.task1;


import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int size = 10;
        double[] arrayMath = new double[size];
        double[] arrayRandom = new double[size];

        for (int i = 0; i < size; i++) {
            arrayMath[i] = Math.random() * 100;
        }

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = random.nextDouble() * 100;
        }

        System.out.println("Массив с использованием Math.random(): " + Arrays.toString(arrayMath));
        System.out.println("Массив с использованием Random: " + Arrays.toString(arrayRandom));

        Arrays.sort(arrayMath);
        Arrays.sort(arrayRandom);

        System.out.println("Отсортированный массив с использованием Math.random(): " + Arrays.toString(arrayMath));
        System.out.println("Отсортированный массив с использованием Random: " + Arrays.toString(arrayRandom));
    }
}