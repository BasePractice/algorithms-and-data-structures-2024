package ru.mirea.practice.s0000001;

import java.util.*;

public class PermJT {

    static int n;
    static int[] a;
    static boolean[] dir;

    static void swap(int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
        boolean tmpDir = dir[i];
        dir[i] = dir[j];
        dir[j] = tmpDir;
    }

    static void show() {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static int largestMov() {
        int maxIdx = -1;
        for (int i = 0; i < n; i++) {
            int nextIdx = dir[i] ? i + 1 : i - 1;
            if (nextIdx >= 0 && nextIdx < n && a[i] > a[nextIdx]) {
                if (maxIdx == -1 || a[i] > a[maxIdx]) {
                    maxIdx = i;
                }
            }
        }
        return maxIdx;
    }

    static void generate() {
        show();
        int idx;
        while ((idx = largestMov()) != -1) {
            int nextIdx = dir[idx] ? idx + 1 : idx - 1;
            swap(idx, nextIdx);
            for (int i = 0; i < n; i++) {
                if (a[i] > a[nextIdx]) {
                    dir[i] = !dir[i];
                }
            }
            show();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        dir = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
            dir[i] = false;
        }
        generate();
        sc.close();
    }
}
