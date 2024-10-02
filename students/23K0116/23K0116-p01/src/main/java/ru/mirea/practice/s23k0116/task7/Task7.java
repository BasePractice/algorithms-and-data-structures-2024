package ru.mirea.practice.s23k0116.task7;

import java.util.Scanner;


public abstract class Task7 {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число:");
            int a = scanner.nextInt();
            long number = factorial(a);
            System.out.println("Факториал числа " + a + " равен: " + number);
        }
    }
}
