package ru.mirea.practice.s23k0359.random;

import java.util.Arrays;
import java.util.Random;


public abstract class Randomise {
    public static void main(String[] args) {
        Random random = new Random();
        double[] mth = new double[10];
        double[] rnd = new double[10];
        for (int i = 0; i < mth.length; i++) {
            mth[i] = Math.random();
            rnd[i] = random.nextDouble();
        }
        System.out.print("\nMath.Random: " + Arrays.toString(mth));
        System.out.print("\nRandom.Random: " + Arrays.toString(rnd));

        Arrays.sort(mth);
        Arrays.sort(rnd);

        System.out.print("\nMath.Random: " + Arrays.toString(mth));
        System.out.print("\nRandom.Random: " + Arrays.toString(rnd));

    }
}