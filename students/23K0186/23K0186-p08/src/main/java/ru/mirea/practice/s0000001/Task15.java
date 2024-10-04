package ru.mirea.practice.s0000001;

import java.util.Scanner;

public abstract class Task15 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("input number N");
            int n = sc.nextInt();
            returner(n);
        }
    }

    public static void returner(int n) {
        if (n == 0) {
            System.out.println(n);
        } else {
            System.out.println(n);
            returner(n - 1);
        }

    }
}
