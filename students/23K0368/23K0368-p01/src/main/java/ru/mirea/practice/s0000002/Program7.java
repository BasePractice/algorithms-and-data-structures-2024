package ru.mirea.practice.s0000002;

import java.util.Scanner;

public abstract class Program7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int n = 0;
            int fact = 1;

            System.out.println("Введите число для вычисления факториала");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
            }

            for (int i = 2; i <= n; i++) {
                fact *= i;
            }

            System.out.println(fact);
        }
    }
}