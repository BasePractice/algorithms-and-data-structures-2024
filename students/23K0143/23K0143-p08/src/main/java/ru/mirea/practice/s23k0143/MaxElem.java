package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public abstract class MaxElem {
    public static void main(String[] args) {
        int max = findMax();
        System.out.println("Максимум последовательности: " + max);
    }

    private static int findMax() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();

            if (number == 0) {
                return Integer.MIN_VALUE;
            }

            return Math.max(number, findMax());
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
