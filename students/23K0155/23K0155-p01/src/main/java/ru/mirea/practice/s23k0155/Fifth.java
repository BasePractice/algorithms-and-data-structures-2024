package ru.mirea.practice.s23k0155;

import java.util.Scanner;

public abstract class Fifth {
    public static int factorial(int x) {
        int res = 1;
        for (int i = 1; i < x + 1; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number ");
            int t = sc.nextInt();
            int res = factorial(t);
            System.out.printf("Factorial of %d is %d", t, res);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
