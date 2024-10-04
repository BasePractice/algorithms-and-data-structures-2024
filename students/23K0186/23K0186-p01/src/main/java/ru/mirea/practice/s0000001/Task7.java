package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task7 {
    public static int factor(int a) {
        int res = 1;
        for (int i = 1;i < a + 1;i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int fact = factor(num);
            System.out.printf("factor of %d = %d",num,fact);
        }
    }
}
