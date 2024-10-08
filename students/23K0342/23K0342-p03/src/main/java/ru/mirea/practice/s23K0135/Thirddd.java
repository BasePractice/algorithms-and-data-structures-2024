package ru.mirea.practice.s23k0342;

import java.util.Arrays;
import java.util.Random;

public abstract class Thirddd {
    public static void main(String[] args) {
        int size = 3;
        double[] arrayUsingMath = new double[size];
        double[] arrayUsingRandom = new double[size];

        for (int i = 0; i < size; i++) {
            arrayUsingMath[i] = Math.random() * 100;
        }

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arrayUsingRandom[i] = random.nextDouble() * 100; // Генерация числа от 0 до 100
        }

        System.out.println("Массив, созданный с использованием Math.random(): " + Arrays.toString(arrayUsingMath));
        System.out.println("Массив, созданный с использованием класса Random: " + Arrays.toString(arrayUsingRandom));

        Arrays.sort(arrayUsingMath);
        Arrays.sort(arrayUsingRandom);

        System.out.println("Отсортированный массив, созданный с использованием Math.random(): " + Arrays.toString(arrayUsingMath));
        System.out.println("Отсортированный массив, созданный с использованием класса Random: " + Arrays.toString(arrayUsingRandom));
    }
}
