package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i = 0;
            int[] mas = new int[10];
            int max = 0;
            int min = 0;
            int sum = 0;
            while (i < 10) {
                mas[i] = sc.nextInt();
                if (i == 0) {
                    min = mas[i];
                    max = mas[i];
                }
                if (mas[i] > max) {
                    max = mas[i];
                }
                if (mas[i] < min) {
                    min = mas[i];
                }
                sum += mas[i];
                i++;
            }
            System.out.println(sum);
            System.out.println(max);
            System.out.println(min);
        }
    }
}
