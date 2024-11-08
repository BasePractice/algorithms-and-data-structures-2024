package ru.mirea.practice.s23k0155;

import java.util.Scanner;

public abstract class Calculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            final int choice = scanner.nextInt();
            System.out.print("Введите первое число: ");
            final double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            final double num2 = scanner.nextDouble();
            double result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.print("Результат сложения: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.print("Результат вычитания: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.print("Результат умножения: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.print("Результат деления: " + result);
                    } else {
                        System.out.print("Ошибка: Деление на ноль невозможно.");
                    }
                    break;
                default:
                    System.out.println("Ошибка: Неверный выбор операции.");
                    break;
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}