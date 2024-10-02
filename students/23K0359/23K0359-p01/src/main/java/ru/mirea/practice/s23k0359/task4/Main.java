package ru.mirea.practice.s23k0359.task4;

import java.util.Scanner;

public abstract class Main {

    public static void main(String[] args) {
        int[] arr = new int[10];
        int i = 0;

        try (Scanner sc = new Scanner(System.in)) {
            while (i < arr.length) {
                arr[i] = sc.nextInt();
                i += 1;
            }
        }
        System.out.println("Min: " + getMin(arr));
        System.out.println("Max: " + getMax(arr));
        System.out.println("Max: " + getSum(arr));
    }

    public static int getMin(int[] arr) {
        int mini = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > mini) {
                mini = arr[i];
            }
            i += 1;
        }
        return mini;
    }

    public static int getMax(int[] arr) {
        int maxi = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < maxi) {
                maxi = arr[i];
            }
            i += 1;
        }
        return maxi;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i += 1;
        }
        return sum;
    }
}
