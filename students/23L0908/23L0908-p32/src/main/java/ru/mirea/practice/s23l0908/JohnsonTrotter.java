package ru.mirea.practice.s23l0908;

import java.util.Arrays;

public final class JohnsonTrotter {

    private JohnsonTrotter() {
    }

    static int[] permutation;
    static boolean[] direction;

    public static void main(String[] args) {
        int n = 4;
        permutation = new int[n];
        direction = new boolean[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
            direction[i] = false;
        }

        printPermutation();
        while (generateNext()) {
            printPermutation();
        }
    }

    static boolean generateNext() {
        int mobileIndex = getMobileIndex();
        if (mobileIndex == -1) {
            return false;
        }

        int d = direction[mobileIndex] ? 1 : -1;
        int swapIndex = mobileIndex + d;
        swap(mobileIndex, swapIndex);
        swap(direction, mobileIndex, swapIndex);
        mobileIndex = swapIndex;

        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > permutation[mobileIndex]) {
                direction[i] = false;
            }
        }
        return true;
    }

    static int getMobileIndex() {
        int mobile = -1;
        int mobileIndex = -1;
        for (int i = 0; i < permutation.length; i++) {
            int d = direction[i] ? 1 : -1;
            int nextPos = i + d;
            if (nextPos >= 0 && nextPos < permutation.length && permutation[i] > permutation[nextPos]) {
                if (permutation[i] > mobile) {
                    mobile = permutation[i];
                    mobileIndex = i;
                }
            }
        }
        return mobileIndex;
    }

    static void swap(int i, int j) {
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;
    }

    static void swap(boolean[] arr, int i, int j) {
        boolean temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printPermutation() {
        System.out.println(Arrays.toString(permutation));
    }
}

