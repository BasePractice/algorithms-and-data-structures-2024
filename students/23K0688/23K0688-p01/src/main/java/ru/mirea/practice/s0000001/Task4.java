package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task4 {
    public static void main(String[] args) {
        int size;
        int min = 0;
        int max = 0;
        int i = 0;
        int sum = 0;
        try (Scanner sc = new Scanner(System.in);) {
            size = sc.nextInt();
            int[] b = new int[size];
            while (i < size) {
                b[i] = sc.nextInt();
                sum += b[i];
                if (i == 0) {
                    min = b[i];
                    max = b[i];
                } else {
                    if (min > b[i]) {
                        min = b[i];
                    }
                    if (max < b[i]) {
                        max = b[i];
                    }
                }
                i += 1;
            }
            System.out.printf("sum=%d,max=%d,min=%d",sum,max,min);
        }
    }

}
