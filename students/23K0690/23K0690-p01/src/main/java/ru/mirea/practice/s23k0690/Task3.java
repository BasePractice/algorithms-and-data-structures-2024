package ru.mirea.practice.s23k0690;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Task3 {
    private Task3() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                try {
                    numbers[i] = scanner.nextInt();
                    sum += numbers[i];
                } catch (InputMismatchException e) {
                    System.out.println("Пожалуйста, введите целое число.");
                    scanner.next();
                    i--;
                }
            }
        }

        System.out.println("Среднее значение: " + (sum / numbers.length));
    }
}