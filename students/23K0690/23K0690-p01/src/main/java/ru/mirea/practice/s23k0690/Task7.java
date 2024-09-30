package ru.mirea.practice.s23k0690;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Task7 {

    private Task7() {
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал не определен для отрицательных чисел.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите число для расчета факториала: ");
            int number = scanner.nextInt();
            System.out.println("Факториал " + factorial(number));
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите целое число.");
        } finally {
            scanner.close();
        }
    }
}
