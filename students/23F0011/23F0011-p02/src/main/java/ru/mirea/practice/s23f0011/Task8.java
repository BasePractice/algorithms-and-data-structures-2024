package ru.mirea.practice.s23f0011;

import java.util.Arrays;

public abstract class Task8 {
    public static void main(String[] args) {
        String [] arr = new String[] {"one", "two", "three", "four", "five", "six", "seven" };
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
