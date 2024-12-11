package ru.mirea.practice.s23k0623;

import java.util.Scanner;

public abstract class MaxNumber {
    public static void main(String[] args) {
        maxElement();
    }

    public static void maxElement() {
        try (Scanner scanner = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE;
            System.out.println("Вводите последовательность по 1-му числу:");
            while (true) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }

                if (number > max) {
                    max = number;
                }
            }

            System.out.println("Макимальное число: " + max);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
