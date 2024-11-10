package ru.mirea.practice.u23k1158.t1;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public abstract class Task1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массивов: ");
            int size = scanner.nextInt();
            Random rand = new Random();
            double[] arrayrand = new double[size];
            double[] arraymath = new double[size];

            for (int i = 0; i < size; i++) {
                arrayrand[i] = rand.nextDouble();
                arraymath[i] = Math.random();
            }
            System.out.printf("arrayrand: %s\n", Arrays.toString(arrayrand));
            System.out.printf("arraymath: %s\n", Arrays.toString(arraymath));
            Arrays.sort(arrayrand);
            Arrays.sort(arraymath);
            System.out.printf("Sorted arrayrand: %s\n", Arrays.toString(arrayrand));
            System.out.printf("Sorted arraymath: %s\n", Arrays.toString(arraymath));
        }
    }
}