package ru.mirea.practice.s0000001.mathrand;

import java.util.Random;
import java.util.Scanner;

public abstract class Task5 {
    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = 0;
            while (n != 10) {
                n = sc.nextInt();
                if (n != 10) {
                    System.out.println("wrong combination");
                }
            }
        }
        Random rd = new Random();
        int cnt = 0;
        System.out.println("first array:");
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = rd.nextInt(10);
            System.out.println(ar1[i]);
            if (ar1[i] % 2 == 0) {
                cnt += 1;
            }
        }
        int j = 0;
        System.out.println("array of even:");
        int[] ar2 = new int[cnt];
        for (int i = 0; i < n; i++) {
            if (ar1[i] % 2 == 0) {
                ar2[j] = ar1[i];
                System.out.println(ar2[j]);
                j += 1;
            }
        }
    }
}
