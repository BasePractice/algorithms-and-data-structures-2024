package ru.mirea.practice.s23k0368.prog2;

import java.util.Arrays;

public abstract class Permutations {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i == -1) {
            return false;
        }

        int j = n - 1;

        while (arr[j] <= arr[i]) {
            j--;
        }

        swap(arr, i, j);

        int l = i + 1;
        int r = n - 1;
        while (l < r) {
            swap(arr, l, r);
            l++;
            r--;
        }

        return true;
    }

    public static void printPermutation(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4};
        printPermutation(arr);
        while (nextPermutation(arr)) {
            printPermutation(arr);
        }
    }
}
