package ru.mirea.practice.lab3.random1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public abstract class ClassRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        try (Scanner scan = new Scanner(System.in)) {
            int len = scan.nextInt();
            double[] arr = new double[len];
            for (int i = 0; i < len; i++) {
                arr[i] = rand.nextDouble();
                System.out.println(arr[i]);
            }
            System.out.println();
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}
