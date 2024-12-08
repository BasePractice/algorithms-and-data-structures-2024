package ru.mirea.practice.s23k0368.prog4;

import java.util.Arrays;

public abstract class JonesTrotter {
    private static int[] p;
    private static int[] dir;

    public static void jonesTrotter(int n) {
        p = new int[n];
        dir = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
            dir[i] = -1;
        }

        printPermutation();

        while (true) {
            int mobileIndex = findMaxMobile(n);

            if (mobileIndex == -1) {
                break;
            }

            int nextIndex = mobileIndex + dir[mobileIndex];

            swap(mobileIndex, nextIndex);

            for (int i = 0; i < n; i++) {
                if (p[i] > p[nextIndex]) {
                    dir[i] *= -1;
                }
            }

            printPermutation();
        }
    }

    private static int findMaxMobile(int n) {
        int maxMobileIndex = -1;
        int maxValue = -1;

        for (int i = 0; i < n; i++) {
            if (isMobile(i)) {
                if (p[i] > maxValue) {
                    maxValue = p[i];
                    maxMobileIndex = i;
                }
            }
        }
        return maxMobileIndex;
    }

    private static boolean isMobile(int i) {
        int nextIndex = i + dir[i];
        return nextIndex >= 0 && nextIndex < p.length && p[i] > p[nextIndex];
    }

    private static void swap(int i, int j) {
        int temp = p[i];
        p[i] = p[j];
        p[j] = temp;

        int tempDir = dir[i];
        dir[i] = dir[j];
        dir[j] = tempDir;
    }

    private static void printPermutation() {
        System.out.println(Arrays.toString(p));
    }

    public static void main(String[] args) {
        int n = 3;
        jonesTrotter(n);
    }
}
