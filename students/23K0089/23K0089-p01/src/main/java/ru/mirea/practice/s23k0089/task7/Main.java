package ru.mirea.practice.s23k0089.task7;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 1; i < n + 1; i++) {
                System.out.printf("%d! = %d\n", i, Factorial.factorial(i));
            }
        }
    }
}
