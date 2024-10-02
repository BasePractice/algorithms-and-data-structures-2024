package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class First {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] mas = new int[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                mas[i] = sc.nextInt();
                sum += mas[i];
            }
            System.out.println(sum);
            System.out.println(sum / 10);
        }
    }
}
