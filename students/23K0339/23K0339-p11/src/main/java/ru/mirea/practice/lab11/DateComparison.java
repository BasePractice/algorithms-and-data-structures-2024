package ru.mirea.practice.lab11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class DateComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату в формате dd.MM.yyyy: ");
            String userInput = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            try {
                final Date userDate = dateFormat.parse(userInput);

                final Date currentDate = new Date();

                Calendar calendarUser = Calendar.getInstance();
                calendarUser.setTime(userDate);
                calendarUser.set(Calendar.HOUR_OF_DAY, 0);
                calendarUser.set(Calendar.MINUTE, 0);
                calendarUser.set(Calendar.SECOND, 0);
                calendarUser.set(Calendar.MILLISECOND, 0);
                final Date onlyUserDate = calendarUser.getTime();

                Calendar calendarCurrent = Calendar.getInstance();
                calendarCurrent.setTime(currentDate);
                calendarCurrent.set(Calendar.HOUR_OF_DAY, 0);
                calendarCurrent.set(Calendar.MINUTE, 0);
                calendarCurrent.set(Calendar.SECOND, 0);
                calendarCurrent.set(Calendar.MILLISECOND, 0);
                Date onlyCurrentDate = calendarCurrent.getTime();

                System.out.println("Текущая дата: " + dateFormat.format(onlyCurrentDate));
                System.out.println("Введенная дата: " + dateFormat.format(onlyUserDate));

                if (onlyUserDate.before(onlyCurrentDate)) {
                    System.out.println("Введенная дата раньше текущей.");
                } else if (onlyUserDate.after(onlyCurrentDate)) {
                    System.out.println("Введенная дата позже текущей.");
                } else {
                    System.out.println("Введенная дата совпадает с текущей.");
                }
            } catch (ParseException e) {
                System.out.println("Ошибка: неверный формат даты.");
            }
        }
    }
}
