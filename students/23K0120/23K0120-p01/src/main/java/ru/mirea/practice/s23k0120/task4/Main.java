package ru.mirea.practice.s23k0120.task4;

import java.util.Locale;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        float[] arr = new float[10];

        int i = 0;

        try (Scanner sc = new Scanner(System.in)) {
            sc.useLocale(Locale.US);
            while (i < arr.length) {
                arr[i] = sc.nextFloat();
                i += 1;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        i = 0;

        float sum = 0;
        float maxN = Float.MIN_VALUE;
        float minN = Float.MAX_VALUE;

        while (i < arr.length) {
            sum += arr[i];
            maxN = Float.max(maxN, arr[i]);
            minN = Float.min(minN, arr[i]);
            i += 1;
        }

        System.out.printf("Sum: %.3f, Max: %.3f, Min: %.3f\n", sum, maxN, minN);
    }
}
