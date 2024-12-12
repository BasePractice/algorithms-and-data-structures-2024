package ru.mirea.practice.s0000001;

import java.util.Arrays;

public class JonsonTrotter {
    private int[] permutation;
    private int[] direction;
    private int n;

    public JonsonTrotter(int n) {
        this.n = n;
        this.permutation = new int[n];
        this.direction = new int[n];
        for (int i = 0; i < n; i++) {
            permutation[i] = i;
            direction[i] = 1;
        }
    }

    public void generatePermutations() {

        printPermutation();

        while (true) {
            int mobileIndex = getMobileIndex();
            if (mobileIndex == -1) {
                break;
            }

            moveMobileElement(mobileIndex);

            printPermutation();

            changeDirection(mobileIndex);
        }
    }

    private void printPermutation() {
        System.out.println(Arrays.toString(permutation));
    }

    private int getMobileIndex() {
        int maxMobile = -1;
        int mobileIndex = -1;

        for (int i = 0; i < n; i++) {
            int currentIndex = permutation[i];
            int nextIndex = currentIndex + direction[currentIndex];


            if (nextIndex >= 0 && nextIndex < n && currentIndex > maxMobile) {
                maxMobile = currentIndex;
                mobileIndex = i;
            }
        }
        return mobileIndex;
    }

    private void moveMobileElement(int mobileIndex) {
        int mobileValue = permutation[mobileIndex];
        int nextIndex = mobileValue + direction[mobileValue];


        permutation[mobileIndex] = permutation[nextIndex];
        permutation[nextIndex] = mobileValue;
    }

    private void changeDirection(int mobileIndex) {
        int mobileValue = permutation[mobileIndex];
        for (int i = 0; i < n; i++) {
            if (permutation[i] > mobileValue) {
                direction[permutation[i]] *= -1;
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        JonsonTrotter jt = new JonsonTrotter(n);
        jt.generatePermutations();
    }
}
