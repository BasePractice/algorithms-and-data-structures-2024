package ru.mirea.practice.s23K0135;

import java.util.Random;
import java.util.Scanner;

public abstract class Fourth {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Random rand = new Random();
            int n;
            do {
                n = scan.nextInt();
            } while (n <= 0);
            int[] m = new int[n];
            int k = 0;
            for (int i = 0; i < n; i++) {
                m[i] = rand.nextInt(n);
                System.out.println(m[i]);
                if (m[i] % 2 == 0) {
                    k++;
                }
            }
            System.out.println(" ");
            int[] m2 = new int[k];
            int j = 0;
            for (int i = 0; i < n; i++) {
                if (m[i] % 2 == 0) {
                    m2[j] = m[i];
                    System.out.println(m2[j]);
                    j++;
                }
            }
        }
    }
}
