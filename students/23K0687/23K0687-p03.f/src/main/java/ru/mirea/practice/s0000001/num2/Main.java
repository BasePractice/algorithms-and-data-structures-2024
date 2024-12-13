package ru.mirea.practice.s0000001.num2;

import java.util.Random;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(90) + 10;
        }

        System.out.println(java.util.Arrays.toString(arr));

        boolean isIncreasing = arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3];

        if (isIncreasing) {
            System.out.println("Array is strictly increasing.");
        } else {
            System.out.println("Array is not strictly increasing.");
        }
    }
}


