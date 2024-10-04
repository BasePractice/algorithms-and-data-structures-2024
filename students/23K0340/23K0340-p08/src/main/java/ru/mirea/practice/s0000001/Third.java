package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Third {
    public static void rec(int a, int b) {
        System.out.println(a);
        if (a < b) {
            rec(a + 1,b);
        } else if (a > b) {
            rec(a - 1, b);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            rec(a,b);
        }
    }
}
