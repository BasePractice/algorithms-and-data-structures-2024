package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        System.out.print("Введите последовательность (последнее число 0): ");
        try (Scanner scanner = new Scanner(System.in)) {
            processSequence(scanner);
        } catch (Exception e) {
            System.out.println("Ошибка ввода: " + e.getMessage());
        }
    }

    public static void processSequence(Scanner scanner) {
        int number = scanner.nextInt();

        if (number == 0) {
            return;
        }

        if (number % 2 != 0) {
            System.out.println(number);
        }

        processSequence(scanner);
    }
}

