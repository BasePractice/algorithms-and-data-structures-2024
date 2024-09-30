package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Pr4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int[] arr = new int[10];
            int idx = 0;
            int mn = 10000000;

            while (idx < 10) {
                System.out.println("Введите число №" + (idx + 1));
                if (scan.hasNextInt()) {
                    arr[idx] = scan.nextInt();
                }
                idx++;
            }

            final int sm = Arrays.stream(arr).sum();
            final int mx = Arrays.stream(arr).max().getAsInt();
            idx = 0;

            do {
                if (arr[idx] < mn) {
                    mn = arr[idx];
                }
                idx++;
            } while (idx < 10);

            System.out.println("Минимум: " + mn);
            System.out.println("Максимум: " + mx);
            System.out.println("Сумма: " + sm);
        }
    }
}