package ru.mirea.practice.s23k0505.task7;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(factorial(sc.nextInt()));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static int factorial(int x) {
        int res = 1;
        for (int i = 1; i <= x; i++) {
            res *= i;
        }
        return res;
    }
}