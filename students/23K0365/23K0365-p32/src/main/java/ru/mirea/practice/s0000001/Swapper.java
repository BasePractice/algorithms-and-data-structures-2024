package ru.mirea.practice.s0000001;

import java.util.Arrays;

public abstract class Swapper {
    public static void main(String[] args) {
        int num = 3;
        int[] ar = new int[num];
        int[] q = new int[num];
        for (int i = 0; i < num; i++) {
            ar[i] = i + 1;
            q[i] = -1;
        }

        while (true) {
            System.out.println(Arrays.toString(ar));
            int index = -1;
            int max = -1;
            for (int i = 0; i < num; i++) {
                if (i + q[i] >= 0 && i + q[i] < ar.length && ar[i] > ar[i + q[i]]
                    && ar[i] > max) {
                    max = ar[i];
                    index = i;
                }
            }
            if (index == -1) {
                System.exit(1);
            }

            int next = index + q[index];
            int temp = ar[index];
            ar[index] = ar[next];
            ar[next] = temp;

            int temp2 = q[index];
            q[index] = q[next];
            q[next] = temp2;

            for (int i = 0; i < num; i++) {
                if (ar[i] > max) {
                    q[i] *= -1;
                }
            }
        }
    }
}
