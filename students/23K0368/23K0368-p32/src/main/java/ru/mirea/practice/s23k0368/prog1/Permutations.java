package ru.mirea.practice.s23k0368.prog1;

public abstract class Permutations {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean nextPermutation(int[] arr) {
        int n = arr.length;
        int j = n - 2;
        while (j >= 0 && arr[j] >= arr[j + 1]) {
            j--;
        }
        if (j == -1) {
            return false;
        }
        int k = n - 1;
        while (arr[j] >= arr[k]) {
            k--;
        }
        swap(arr, j, k);
        int r = n - 1;
        while (j < r) {
            swap(arr, j + 1, r);
            j++;
            r--;
        }
        return true;
    }

    public static void printPermutation(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printPermutation(arr);
        while (nextPermutation(arr)) {
            printPermutation(arr);
        }
    }
}
