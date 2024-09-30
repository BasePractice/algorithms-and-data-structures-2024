package ru.mirea.practice.lab3.random1;

import java.util.Arrays;
import java.util.Scanner;

public abstract class MethodRandom {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int len = sc.nextInt();
            double[] mas = new double[len];
            for (int i = 0; i < len; i++) {
                mas[i] = Math.random();
                System.out.println(mas[i]);
            }
            Arrays.sort(mas);
            System.out.println(Arrays.toString(mas));
        }
    }
}
