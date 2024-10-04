package ru.mirea.practice.s23f0011;

import java.util.Scanner;

public abstract class Task7 {
    public static long factorial(int n) {
        long answer = 1;
        for (int i = 1; i <= n; i++) {
            answer *= i;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите целое неотрицательное число: ");
            n = sc.nextInt();
        }
        long fact = factorial(n);
        System.out.printf("Факториал n = %d равен: %d%n", n, fact);
    }
}
