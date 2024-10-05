package ru.mirea.practice.s23L0908;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Prog4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ln = 3;
            int min = 9999;
            int max = 0;
            int i = 0;
            System.out.println("lenght of array = " + ln);
            int[] b = new int[ln];
            while (i < ln) {
                b[i] = sc.nextInt();
                if (min > b[i]) {
                    min = b[i];
                }
                if (max < b[i]) {
                    max = b[i];
                }
                i++;
            }
            int sum = Arrays.stream(b).sum();
            System.out.println("summary: " + sum);
            System.out.println("maximum: " + max + "; minimum: " + min);
        }
    }
}
