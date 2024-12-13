package ru.mirea.practice.s23k0145.lab1;

public abstract class JohnsonTrotter {
    public static void displayPermutation(int[] sequence) {
        for (int value : sequence) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void generateJohnsonTrotter(int n) {
        int[] sequence = new int[n];
        int[] movement = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = i + 1;
            movement[i] = 0;
        }

        displayPermutation(sequence);

        boolean hasNext = true;

        while (hasNext) {
            int largestMobileValue = -1;
            int largestMobileIndex = -1;

            for (int i = 0; i < n; i++) {
                if (movement[i] == 0 && i > 0 && sequence[i] > sequence[i - 1]
                        || movement[i] == 1 && i < n - 1 && sequence[i] > sequence[i + 1]) {

                    if (sequence[i] > largestMobileValue) {
                        largestMobileValue = sequence[i];
                        largestMobileIndex = i;
                    }
                }
            }

            if (largestMobileValue == -1) {
                hasNext = false;
            } else {
                int currentIndex = largestMobileIndex;
                int tempValue = sequence[currentIndex];

                if (movement[currentIndex] == 0) {
                    sequence[currentIndex] = sequence[currentIndex - 1];
                    sequence[currentIndex - 1] = tempValue;
                    movement[currentIndex] = 1;
                    movement[currentIndex - 1] = 0;
                } else {
                    sequence[currentIndex] = sequence[currentIndex + 1];
                    sequence[currentIndex + 1] = tempValue;
                    movement[currentIndex] = 0;
                    movement[currentIndex + 1] = 1;
                }

                for (int i = 0; i < n; i++) {
                    if (sequence[i] > largestMobileValue) {
                        movement[i] = 1 - movement[i];
                    }
                }

                displayPermutation(sequence);
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        generateJohnsonTrotter(n);
    }
}
