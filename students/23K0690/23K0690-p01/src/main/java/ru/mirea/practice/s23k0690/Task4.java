package ru.mirea.practice.s23k0690;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Task4 {

    private Task4() {
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numbers.length; i++) {
                try {
                    numbers[i] = scanner.nextInt();
                    if (numbers[i] > max) {
                        max = numbers[i];
                    }
                    if (numbers[i] < min) {
                        min = numbers[i];
                    }
                    sum += numbers[i];
                } catch (InputMismatchException e) {
                    System.out.println("Пожалуйста, введите целое число.");
                    scanner.next();
                    i--;
                }
            }
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Max элемент: " + max);
        System.out.println("Min элемент: " + min);
    }
}