package ru.mirea.practice.s23k0155;

import java.util.Scanner;

public abstract class MaxCount {
    public static void main(String[] args) {
        countMaxElements();
    }

    public static void countMaxElements() {
        try (Scanner scanner = new Scanner(System.in)) {
            int max = Integer.MIN_VALUE;
            int maxCount = 0;
            System.out.println("Вводите последовательность по 1-му числу:");
            while (true) {
                int number = scanner.nextInt();
                if (number == 0) {
                    break;
                }

                if (number > max) {
                    max = number;
                    maxCount = 1;
                } else if (number == max) {
                    maxCount++;
                }
            }

            System.out.println("Количество элементов, равных максимуму (" + max + "): " + maxCount);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
