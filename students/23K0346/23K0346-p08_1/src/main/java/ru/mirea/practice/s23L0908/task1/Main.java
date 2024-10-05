package ru.mirea.practice.s23L0908.task1;

import java.util.Scanner;

public abstract class Main {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long combination(int n, int k) {
        if (k > n) {
            return 0;
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите количество нулей (a): ");
            int a = scanner.nextInt();

            System.out.print("Введите количество единиц (b): ");
            int b = scanner.nextInt();

            long result = combination(b + 1, a);

            System.out.println("Количество последовательностей из " + a + " нулей и " + b + " единиц: " + result);
        } finally {
            scanner.close();
        }
    }
}
