package ru.mirea.practice.s23k0135;

import static ru.mirea.practice.s23k0135.LexicographicalPermutations.printPermutation;
import static ru.mirea.practice.s23k0135.LexicographicalPermutations.nextPermutation;

public abstract class Test {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        do {
            printPermutation(arr);
        } while (nextPermutation(arr));
    }
}
