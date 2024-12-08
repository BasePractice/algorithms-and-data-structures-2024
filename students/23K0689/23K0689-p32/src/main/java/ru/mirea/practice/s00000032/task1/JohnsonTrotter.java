package ru.mirea.practice.s00000032.task1;

public final class JohnsonTrotter {

    private JohnsonTrotter() {
    }

    private static int getLargestMobileIndex(int[] permutation, boolean[] direction) {
        int index = -1;
        for (int i = 0; i < permutation.length; i++) {
            int targetIndex = i + (direction[i] ? -1 : 1);
            if (targetIndex >= 0 && targetIndex < permutation.length
                && permutation[i] > permutation[targetIndex]) {
                if (index == -1 || permutation[i] > permutation[index]) {
                    index = i;
                }
            }
        }
        return index;
    }

    private static void swap(int[] permutation, boolean[] direction, int i, int j) {
        int temp = permutation[i];
        permutation[i] = permutation[j];
        permutation[j] = temp;

        boolean tempDirection = direction[i];
        direction[i] = direction[j];
        direction[j] = tempDirection;
    }

    private static void changeDirection(int[] permutation, boolean[] direction, int mobileValue) {
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] > mobileValue) {
                direction[i] = !direction[i];
            }
        }
    }

    private static void generatePermutations(int n) {
        int[] permutation = new int[n];
        boolean[] direction = new boolean[n];

        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
            direction[i] = true;
        }

        printPermutation(permutation);

        while (true) {
            int largestMobileIndex = getLargestMobileIndex(permutation, direction);
            if (largestMobileIndex == -1) {
                break;
            }

            int targetIndex = largestMobileIndex + (direction[largestMobileIndex] ? -1 : 1);
            swap(permutation, direction, largestMobileIndex, targetIndex);
            changeDirection(permutation, direction, permutation[targetIndex]);

            printPermutation(permutation);
        }
    }

    private static void printPermutation(int[] permutation) {
        for (int i : permutation) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
