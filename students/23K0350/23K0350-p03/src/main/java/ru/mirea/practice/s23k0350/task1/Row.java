package ru.mirea.practice.s23k0350.task1;

import java.util.Arrays;
import java.util.Random;

public abstract class Row {
    public static void main(String[] args) {
        Random ranin = new Random();
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = ranin.nextInt(10, 100);
        }
        System.out.println(Arrays.toString(a));
        if (a[0] < a[1] && a[1] < a[2] && a[2] < a[3]) {
            System.out.println("Это строго возрастающая последовательность.");
        } else {
            System.out.println("Это не строго возрастающая последовательность.");
        }
    }
}