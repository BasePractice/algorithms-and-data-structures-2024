package ru.mirea.practice.s23k0215.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class UserDateCalendar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите год: ");
            final int year = scanner.nextInt();

            System.out.print("Введите месяц (1-12): ");
            final int month = scanner.nextInt() - 1;

            System.out.print("Введите число: ");
            final int day = scanner.nextInt();

            System.out.print("Введите часы: ");
            final int hour = scanner.nextInt();

            System.out.print("Введите минуты: ");
            final int minute = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, hour, minute);

            Date date = calendar.getTime();

            System.out.println("Объект Calendar: " + calendar.getTime());
            System.out.println("Объект Date: " + date);
        }
    }
}

