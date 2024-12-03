package ru.mirea.practice.s23k0093;

import java.util.Date;
import java.util.Scanner;

public abstract class DateComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Получаем текущую дату и время
            Date currentDate = new Date();
            System.out.println("Текущая дата и время: " + currentDate);

            // Запрашиваем у пользователя дату
            System.out.print("Введите дату в формате ГГГГ-ММ-ДД (например, 2023-10-30): ");
            String userInput = scanner.nextLine();

            Date userDate;
            try {
                userDate = java.sql.Date.valueOf(userInput);
                System.out.println("Введенная вами дата: " + userDate);

                // Сравниваем даты
                if (userDate.before(currentDate)) {
                    System.out.println("Введенная дата раньше текущей.");
                } else if (userDate.after(currentDate)) {
                    System.out.println("Введенная дата позже текущей.");
                } else {
                    System.out.println("Введенная дата совпадает с текущей.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный формат даты. Пожалуйста, используйте ГГГГ-ММ-ДД.");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
