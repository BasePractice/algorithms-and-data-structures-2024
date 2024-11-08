package ru.mirea.practice.s23k0116.task;

import java.util.Scanner;

public final class Calculator {

    private Calculator() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continueCalculator = true;

            while (continueCalculator) {
                System.out.println("===== Калькулятор =====");
                System.out.println("Выберите операцию:");
                System.out.println("1. Сложение");
                System.out.println("2. Вычитание");
                System.out.println("3. Умножение");
                System.out.println("4. Деление");
                System.out.println("5. Выход");
                System.out.print("Введите номер операции (1-5): ");

                int choice = 0;

                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    System.out.println("Некорректный ввод. Введите цифру от 1 до 5.");
                    scanner.next();
                    continue;
                }

                if (choice == 5) {
                    System.out.println("Завершение работы калькулятора. До свидания!");
                    break;
                }

                if (choice < 1 || choice > 5) {
                    System.out.println("Некорректный ввод. Введите цифру от 1 до 5.");
                    continue;
                }

                System.out.print("Введите первое число: ");
                double number1 = 0;
                if (scanner.hasNextDouble()) {
                    number1 = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод. попробуйте ещё раз.");
                    scanner.next();
                    continue;
                }

                System.out.print("Введите второе число: ");
                double number2 = 0;
                if (scanner.hasNextDouble()) {
                    number2 = scanner.nextDouble();
                } else {
                    System.out.println("Некорректный ввод. Попробуйте ещё раз.");
                    scanner.next();
                    continue;
                }

                double result = 0;

                switch (choice) {
                    case 1:
                        result = number1 + number2;
                        System.out.printf("Результат: %.2f + %.2f = %.2f%n", number1, number2, result);
                        break;
                    case 2:
                        result = number1 - number2;
                        System.out.printf("Результат: %.2f - %.2f = %.2f%n", number1, number2, result);
                        break;
                    case 3:
                        result = number1 * number2;
                        System.out.printf("Результат: %.2f * %.2f = %.2f%n", number1, number2, result);
                        break;
                    case 4:
                        if (number2 == 0) {
                            System.out.println("Ошибка: Нельзя делить на ноль.");
                        } else {
                            result = number1 / number2;
                            System.out.printf("Результат: %.2f / %.2f = %.2f%n", number1, number2, result);
                        }
                        break;
                    default:
                        System.out.println("Неизвестная операция.");
                        break;
                }

                System.out.println();
            }
        }
    }
}
