package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public final class Main {

    private Main() {}

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            int s = 0;
            int idx = 0;
            do {
                s += a[idx];
                idx++;
            } while (idx < n);

            int mx = a[0];
            int mn = a[0];
            idx = 1;
            while (idx < n) {
                if (a[idx] > mx) {
                    mx = a[idx];
                }
                if (a[idx] < mn) {
                    mn = a[idx];
                }
                idx++;
            }

            System.out.println(s);
            System.out.println(mx);
            System.out.println(mn);
        }
    }
}
