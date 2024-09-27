package ru.mirea.practice.s0000001;

import java.util.Arrays;
import java.util.Scanner;

public abstract class Prog3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ln = 3;
            int sr;
            System.out.println("lenght of array = " + ln);
            int[] b = new int[ln];
            for (int i = 0; i < ln; i++) {
                b[i] = sc.nextInt();
            }
            int sum = Arrays.stream(b).sum();
            sr = sum / ln;
            System.out.println("summary: " + sum + "; srednee: " + sr);
        }
    }
}
