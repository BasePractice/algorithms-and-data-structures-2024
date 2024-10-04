package ru.mirea.practice.s23k0623;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите размер массива: ");
            float[] a = new float[sc.nextInt()];
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    a[i] = rand.nextFloat();
                } else {
                    a[i] = (float) Math.random();
                }
            }
            System.out.println(Arrays.toString(a));
            Arrays.sort(a);
            System.out.println("Отсортированный массив: " + Arrays.toString(a));
        }
    }
}
