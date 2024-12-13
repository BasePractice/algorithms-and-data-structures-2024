package ru.mirea.practice.s23k0114.lab1;

public abstract class JohnsonTrotter {

    public static void printPermutation(int[] permutation) {
        for (int num : permutation) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void generatePermutations(int n) {
        int[] permutation = new int[n];
        int[] direction = new int[n];

        for (int i = 0; i < n; i++) {
            permutation[i] = i + 1;
            direction[i] = 0;
        }

        printPermutation(permutation);

        boolean hasNext = true;
        while (hasNext) {
            int largestMobile = -1;
            int largestMobileIndex = -1;

            for (int i = 0; i < n; i++) {
                if (direction[i] == 0 && i > 0 && permutation[i] > permutation[i - 1]
                    || direction[i] == 1 && i < n - 1 && permutation[i] > permutation[i + 1]) {

                    if (permutation[i] > largestMobile) {
                        largestMobile = permutation[i];
                        largestMobileIndex = i;
                    }
                }
            }

            if (largestMobile == -1) {
                hasNext = false;
            } else {
                int index = largestMobileIndex;
                int temp = permutation[index];


                if (direction[index] == 0) {
                    permutation[index] = permutation[index - 1];
                    permutation[index - 1] = temp;
                    direction[index] = 1;
                    direction[index - 1] = 0;
                } else {
                    permutation[index] = permutation[index + 1];
                    permutation[index + 1] = temp;
                    direction[index] = 0;
                    direction[index + 1] = 1;
                }

                for (int i = 0; i < n; i++) {
                    if (permutation[i] > largestMobile) {
                        direction[i] = 1 - direction[i];
                    }
                }

                printPermutation(permutation);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}

