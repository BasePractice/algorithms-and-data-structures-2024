package ru.mirea.practice.s23k0089.task1;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите первое число: ");
            final float num1 = scanner.nextFloat();
            System.out.print("Введите второе число: ");
            final float num2 = scanner.nextFloat();
            System.out.println("Выберите операцию:");
            System.out.println("1 - сложение");
            System.out.println("2 - вычитание");
            System.out.println("3 - умножение");
            System.out.println("4 - деление");

            int choice = scanner.nextInt();
            float result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Результат: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Результат: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Результат: " + result);
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Результат: " + result);
                    } else {
                        System.out.println("Ошибка: деление на ноль");
                    }
                    break;
                default:
                    System.out.println("Ошибка: введена неверная цифра");
                    break;
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
