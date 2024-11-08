package ru.mirea.practice.s23k0140.task1;

import java.util.Scanner;
import java.util.InputMismatchException;

public final class Calculator {

    private Calculator() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean validInput = false;
            int size = 0;
            while (!validInput) {
                System.out.println("Добро пожаловать в калькулятор, введите первое число:");
                try {
                    size = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }
            validInput = false;
            int size2 = 0;
            while (!validInput) {
                System.out.println("Введите второе число:");

                try {
                    size2 = scanner.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                    scanner.next();
                }
            }

            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Умножение");
            System.out.println("4. Деление");

            int choice = scanner.nextInt();
            double result;
            switch (choice) {
                case 1:
                    result = size + size2;
                    System.out.println("Результат: " + result);
                    break;
                case 2:
                    result = size - size2;
                    System.out.println("Результат: " + result);
                    break;
                case 3:
                    result = size * size2;
                    System.out.println("Результат: " + result);
                    break;
                case 4:
                    if (size2 != 0) {
                        result = size / size2;
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Ошибка: Деление на ноль невозможно.");
                    }
                    break;
                default:
                    System.out.println("Неверный выбор операции.");
                    break;
            }
        }
    }
}