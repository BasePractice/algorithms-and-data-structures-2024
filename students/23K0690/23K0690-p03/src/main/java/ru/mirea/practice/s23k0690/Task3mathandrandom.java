package ru.mirea.practice.s23k0690;

import java.util.Arrays;

public final class Task3mathandrandom {

    private Task3mathandrandom() {
    }

    public static void main(String[] args) {
        double[] ar = new double[4];

        for (int i = 0; i < 4; i++) {
            ar[i] = Math.random() * 90 + 10;
        }

        System.out.println(Arrays.toString(ar));

        if (ar[0] < ar[1] && ar[1] < ar[2] && ar[2] < ar[3]) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}


