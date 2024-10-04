package ru.mirea.practice.lab3.random3;

import java.util.Random;

public abstract class RandomSequence {
    public static void main(String[] args) {
        Random rand = new Random();
        int len = 4;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = rand.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        for (int j = 1; j < len; j++) {
            if (arr[j
                    ] <= arr[j - 1]) {
                System.out.println("\nНе является");
                System.exit(1);
            }
        }
        System.out.println("\nЯвляется");
    }
}
