package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public abstract class JohnsonTrotter {
    private static final int LEFT = -1;

    public static void generatePermutations(int n) {
        List<Integer> permutation = new ArrayList<>();
        List<Integer> directions = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            permutation.add(i);
            directions.add(LEFT);
        }

        printPermutation(permutation);

        while (true) {
            int largestMobileIndex = -1;
            int largestMobileValue = -1;

            for (int i = 0; i < n; i++) {
                int currentDirection = directions.get(i);
                int neighborIndex = i + currentDirection;

                if (neighborIndex >= 0 && neighborIndex < n && permutation.get(i) > permutation.get(neighborIndex)) {
                    if (permutation.get(i) > largestMobileValue) {
                        largestMobileValue = permutation.get(i);
                        largestMobileIndex = i;
                    }
                }
            }

            if (largestMobileIndex == -1) {
                break;
            }

            int newIndex = largestMobileIndex + directions.get(largestMobileIndex);
            swap(permutation, largestMobileIndex, newIndex);
            swap(directions, largestMobileIndex, newIndex);

            for (int i = 0; i < n; i++) {
                if (permutation.get(i) > largestMobileValue) {
                    directions.set(i, directions.get(i) * -1);
                }
            }

            printPermutation(permutation);
        }
    }

    private static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private static void printPermutation(List<Integer> permutation) {
        for (int num : permutation) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}

