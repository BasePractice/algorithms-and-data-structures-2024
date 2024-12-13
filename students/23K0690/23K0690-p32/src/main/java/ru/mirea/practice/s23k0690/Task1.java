package ru.mirea.practice.s23k0690;

import java.util.Arrays;

public final class Task1 {

    private Task1() {}

    public static void generatePermutations(int n) {
        int[] pA = new int[n];
        int[] dA = new int[n];

        for (int i = 0; i < n; i++) {
            pA[i] = i + 1;
            dA[i] = -1;
        }

        printPermutation(pA);

        while (true) {
            int max = -1;
            int maxIdx = -1;

            for (int i = 0; i < n; i++) {
                if (dA[i] == -1 && i > 0 && pA[i] > pA[i - 1] || dA[i] == 1 && i < n - 1 && pA[i] < pA[i + 1]) {
                    if (pA[i] > max) {
                        max = pA[i];
                        maxIdx = i;
                    }
                }
            }

            if (max == -1) {
                break;
            }

            dA[maxIdx] = -dA[maxIdx];

            if (dA[maxIdx] == -1 && maxIdx > 0) {
                swap(pA, maxIdx, maxIdx - 1);
            } else if (dA[maxIdx] == 1 && maxIdx < n - 1) {
                swap(pA, maxIdx, maxIdx + 1);
            }

            printPermutation(pA);
        }
    }

    private static void swap(int[] permutationArray, int i, int j) {
        int temp = permutationArray[i];
        permutationArray[i] = permutationArray[j];
        permutationArray[j] = temp;
    }

    private static void printPermutation(int[] permutationArray) {
        System.out.println(Arrays.toString(permutationArray));
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
