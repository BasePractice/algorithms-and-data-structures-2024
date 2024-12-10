package ru.mirea.practice.s0000001.task1;

public final class JohnsonTrotter {
    private JohnsonTrotter() {
    }

    private static void printPermutation(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void generatePermutations(int n) {
        int[] arr = new int[n];
        int[] directions = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            directions[i] = -1;
        }

        printPermutation(arr);

        boolean finished = false;
        while (!finished) {
            int largestMobile = -1;
            int largestMobileIndex = -1;

            for (int i = 0; i < n; i++) {
                int curr = arr[i];
                int dir = directions[i];
                int nextIndex = i + dir;

                if (nextIndex >= 0 && nextIndex < n && arr[nextIndex] < curr) {
                    if (curr > largestMobile) {
                        largestMobile = curr;
                        largestMobileIndex = i;
                    }
                }
            }

            if (largestMobile == -1) {
                finished = true;
            } else {
                int moveIndex = largestMobileIndex;
                int moveValue = arr[moveIndex];
                int moveDirection = directions[moveIndex];

                arr[moveIndex] = arr[moveIndex + moveDirection];
                arr[moveIndex + moveDirection] = moveValue;

                directions[moveIndex] = -directions[moveIndex];

                printPermutation(arr);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
