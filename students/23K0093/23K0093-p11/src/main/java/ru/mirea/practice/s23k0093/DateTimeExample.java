package ru.mirea.practice.s23k0093;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class DateTimeExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Запрос у пользователя года, месяца, дня, часов и минут
            System.out.print("Введите год: ");
            int year = scanner.nextInt();

            System.out.print("Введите месяц (1-12): ");
            int month = scanner.nextInt(); // Месяцы от 1 до 12

            System.out.print("Введите день: ");
            int day = scanner.nextInt();

            System.out.print("Введите часы (0-23): ");
            int hour = scanner.nextInt();

            System.out.print("Введите минуты (0-59): ");
            int minute = scanner.nextInt();

            // Месяцы в Date начинаются с 0 (январь), поэтому вычитаем 1
            Date date = new Date(year - 1900, month - 1, day, hour, minute);

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day, hour, minute);

            System.out.println("Созданный объект Date: " + date);
            System.out.println("Созданный объект Calendar: " + calendar.getTime());

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
