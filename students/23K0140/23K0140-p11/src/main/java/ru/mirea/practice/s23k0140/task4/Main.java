package ru.mirea.practice.s23k0140.task4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            final int year = scanner.nextInt();

            System.out.print("Введите месяц: ");
            final int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Ошибка: Месяц должен быть в диапазоне от 1 до 12.");
                return;
            }

            System.out.print("Введите день: ");
            final int day = scanner.nextInt();
            if (day < 1 || day > 31) {
                System.out.println("Ошибка: День должен быть в диапазоне от 1 до 31.");
                return;
            }

            System.out.print("Введите часы: ");
            final int hour = scanner.nextInt();
            if (hour < 0 || hour > 23) {
                System.out.println("Ошибка: Часы должны быть в диапазоне от 0 до 23.");
                return;
            }

            System.out.print("Введите минуты: ");
            final int minute = scanner.nextInt();
            if (minute < 0 || minute > 59) {
                System.out.println("Ошибка: Минуты должны быть в диапазоне от 0 до 59.");
                return;
            }

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            calendar.set(Calendar.HOUR_OF_DAY, hour);
            calendar.set(Calendar.MINUTE, minute);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date date = calendar.getTime();

            System.out.println("\nСозданный объект Calendar:");
            System.out.println(calendar.getTime());

            System.out.println("Созданный объект Date:");
            System.out.println(date);

            Date currentDate = new Date();
            if (date.before(currentDate)) {
                System.out.println("Введённая дата и время ранее текущей системной даты.");
            } else if (date.after(currentDate)) {
                System.out.println("Введённая дата и время позже текущей системной даты.");
            } else {
                System.out.println("Введённая дата и время совпадают с текущей системной датой.");
            }

        } catch (Exception e) {
            System.out.println("Ошибка ввода. Пожалуйста, вводите только числовые значения.");
        }
    }
}