package ru.mirea.practice.s0000001.prog11;

import java.util.Scanner;

public abstract class Main {
    public static int recursion() {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 0) {
                int m = scanner.nextInt();
                if (m == 0) {
                    return 0;
                } else if (m == 1) {
                    return recursion() + m;
                } else {
                    return recursion();
                }
            }
            if (n == 1) {
                int m = scanner.nextInt();
                if (m == 0) {
                    int k = scanner.nextInt();
                    if (k == 0) {
                        return 0;
                    }
                }
                if (m == 1) {
                    return recursion() + n + m;
                } else {
                    return recursion() + n;
                }
            } else {
                int m = scanner.nextInt();
                if (m == 0) {
                    int k = scanner.nextInt();
                    if (k == 0) {
                        return 0;
                    } else {
                        return recursion();
                    }
                }
                if (m == 1) {
                    return recursion() + m;
                } else {
                    return recursion();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}