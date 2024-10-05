package ru.mirea.practice.s23L0908;

import java.util.Arrays;
import java.util.Random;

public abstract class First {
    public static void main(String[] args) {
        int size = 5;
        double[] randomMath = new double[size];
        double[] randomRand = new double[size];

        for (int i = 0; i < size; i++) {
            randomMath[i] = Math.random() * 100;
        }

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomRand[i] = random.nextDouble() * 100;
        }

        System.out.printf("Math array non-sort: %s\n", Arrays.toString(randomMath));
        System.out.printf("Rand array non-sort: %s\n", Arrays.toString(randomRand));

        Arrays.sort(randomMath);
        Arrays.sort(randomRand);

        System.out.printf("\nMath array sort: %s\n", Arrays.toString(randomMath));
        System.out.printf("Rand array sort: %s\n", Arrays.toString(randomRand));

    }
}
