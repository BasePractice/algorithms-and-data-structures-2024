package ru.mirea.practice.s23k0375.task1;

import java.util.Arrays;

public class JohnsonTrotter {
    private final int[] perm;
    private final int[] dir;
    private final int n;

    public JohnsonTrotter(int n) {
        this.n = n;
        this.perm = new int[n];
        this.dir = new int[n];


        for (int i = 0; i < n; i++) {
            perm[i] = i + 1; // {1, 2, ..., n}
            dir[i] = 1;
        }
    }

    public void generatePermutations() {
        System.out.println(Arrays.toString(perm));

        while (true) {
            int mobileIndex = findLargestMobile();
            if (mobileIndex == -1) {
                break;
            }

            int mobileValue = perm[mobileIndex];
            int moveDirection = dir[mobileIndex];

            if (moveDirection == 1) {
                swap(mobileIndex, mobileIndex + 1);
            } else { // Стрелка указывает влево
                swap(mobileIndex, mobileIndex - 1);
            }

            for (int i = 0; i < n; i++) {
                if (perm[i] > mobileValue) {
                    dir[i] = -dir[i];
                }
            }

            System.out.println(Arrays.toString(perm));
        }
    }

    private int findLargestMobile() {
        int largestMobile = -1;
        int mobileIndex = -1;

        for (int i = 0; i < n; i++) {
            if (dir[i] == 1 && i < n - 1 && perm[i] > perm[i + 1]) {
                if (perm[i] > largestMobile) {
                    largestMobile = perm[i];
                    mobileIndex = i;
                }
            } else if (dir[i] == -1 && i > 0 && perm[i] > perm[i - 1]) {
                if (perm[i] > largestMobile) {
                    largestMobile = perm[i];
                    mobileIndex = i;
                }
            }
        }
        return mobileIndex;
    }

    private void swap(int i, int j) {
        int temp = perm[i];
        perm[i] = perm[j];
        perm[j] = temp;

        temp = dir[i];
        dir[i] = dir[j];
        dir[j] = temp;
    }

    public static void main(String[] args) {
        int n = 3;
        JohnsonTrotter jt = new JohnsonTrotter(n);
        jt.generatePermutations();
    }
}
