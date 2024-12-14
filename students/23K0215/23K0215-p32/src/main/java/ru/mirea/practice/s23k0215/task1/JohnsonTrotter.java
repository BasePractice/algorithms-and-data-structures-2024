package ru.mirea.practice.s23k0215.task1;

import java.util.Arrays;

public final class JohnsonTrotter {

    private JohnsonTrotter() {
        throw new UnsupportedOperationException("Невозможно создать экземпляр утилитарного класса.");
    }

    public static void generatePermutations(int n) {
        int[] p = new int[n];
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
            d[i] = -1;
        }

        printPermutation(p);

        while (true) {
            int max = -1;
            int maxIdx = -1;

            for (int i = 0; i < n; i++) {
                if (d[i] == -1 && i > 0 && p[i] > p[i - 1] || d[i] == 1 && i < n - 1 && p[i] < p[i + 1]) {
                    if (p[i] > max) {
                        max = p[i];
                        maxIdx = i;
                    }
                }
            }

            if (max == -1) {
                break;
            }

            d[maxIdx] = -d[maxIdx];

            if (d[maxIdx] == -1 && maxIdx > 0) {
                swap(p, maxIdx, maxIdx - 1);
            } else if (d[maxIdx] == 1 && maxIdx < n - 1) {
                swap(p, maxIdx, maxIdx + 1);
            }

            printPermutation(p);
        }
    }

    private static void swap(int[] p, int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;
    }

    private static void printPermutation(int[] p) {
        System.out.println(Arrays.toString(p));
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
