package ru.mirea.practice.s23L0908.task3;

import java.util.Random;

public abstract class FourNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                if (arr[i] > arr[j]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("\nVozrastaet!");
        } else {
            System.out.println("\nNe vozrastaet!");
        }
    }
}
