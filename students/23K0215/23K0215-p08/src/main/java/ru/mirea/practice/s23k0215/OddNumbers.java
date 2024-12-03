package ru.mirea.practice.s23k0215;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class OddNumbers {
    private OddNumbers() {

    }

    public static void main(String[] args) {
        try {
            oddNumbers();
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число.");
        }
    }

    public static void oddNumbers() {
        try (Scanner scanner = new Scanner(System.in)) { // Используем try-with-resources
            int number = scanner.nextInt();
            if (number != 0) {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
                oddNumbers(); // Рекурсивно вызываем метод для следующего числа
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода. Введите целое число.");
            oddNumbers(); // Повторяем ввод после ошибки
        }
    }
}

