package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task3 {
    public static void main(String[] args) {
        int a;
        int sums = 0;
        int mean = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int[] b = new int[10];
            for (int i = 0; i < 10; i++) {
                a = sc.nextInt();
                b[i] = a;
                sums += b[i];
            }
            mean = sums / b.length;
            System.out.printf("mean=%d,sum=%d", mean, sums);
        }
    }
}

