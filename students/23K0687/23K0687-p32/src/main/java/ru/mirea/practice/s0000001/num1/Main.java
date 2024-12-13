package ru.mirea.practice.s0000001.num1;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    static void printPermutation(int[] perm) {
        for (int p : perm) {
            System.out.print(p + " ");
        }
        System.out.println();
    }

    static void johnsonTrotter(int n) {
        int[] perm = new int[n];
        int[] dir = new int[n];
        for (int i = 0; i < n; i++) {
            perm[i] = i + 1;
            dir[i] = -1;
        }
        printPermutation(perm);

        boolean finished = false;
        while (!finished) {
            int largest = -1;
            for (int i = 0; i < n; i++) {
                if (dir[i] == -1 && i > 0 && perm[i] > perm[i - 1]) {
                    largest = i;
                    break;
                } else if (dir[i] == 1 && i < n - 1 && perm[i] > perm[i + 1]) {
                    largest = i;
                    break;
                }
            }

            if (largest == -1) {
                finished = true;
            } else {
                dir[largest] = -dir[largest];
                int temp = perm[largest];
                perm[largest] = perm[largest + dir[largest]];
                perm[largest + dir[largest]] = temp;

                printPermutation(perm);
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        johnsonTrotter(n);
    }
}
