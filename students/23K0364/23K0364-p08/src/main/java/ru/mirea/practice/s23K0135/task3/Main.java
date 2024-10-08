package ru.mirea.practice.s23K0135.task3;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maxNumber = findMax();
            System.out.println("Максимальное число: " + maxNumber);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static int findMax() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = scanner.nextInt();

            if (number == 0) {
                return 0;
            }

            int maxFromRest = findMax();

            return Math.max(number, maxFromRest);
        }
    }
}

