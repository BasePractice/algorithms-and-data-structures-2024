package ru.mirea.practices0000001.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class DateAndCalendarCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hours = 0;
        int minutes = 0;
        try {

            System.out.println("Введите год (например, 2023):");
            year = scanner.nextInt();

            System.out.println("Введите месяц (1-12):");
            month = scanner.nextInt() - 1;

            System.out.println("Введите число (1-31):");
            day = scanner.nextInt();

            System.out.println("Введите часы (0-23):");
            hours = scanner.nextInt();

            System.out.println("Введите минуты (0-59):");
            minutes = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, hours, minutes);

            Date date = calendar.getTime();

            System.out.println("Созданный объект Date: " + date);
            System.out.println("Созданный объект Calendar: " + calendar.getTime());

        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат ввода.");
        } finally {
            scanner.close();
        }
    }
}