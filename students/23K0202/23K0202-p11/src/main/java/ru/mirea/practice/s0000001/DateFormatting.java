package ru.mirea.practice.s0000001;

import java.util.Calendar;
import java.util.Scanner;

public final class DateFormatting {
    private DateFormatting() {

    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.println("Введите год месяц число (например, 2024 11 2):");
            int yearInput = inputScanner.nextInt();
            int monthInput = inputScanner.nextInt() - 1; // Месяцы начинаются с 0
            int dayInput = inputScanner.nextInt();
            System.out.println("Введите часы минуты (например, 9 10):");
            int hourInput = inputScanner.nextInt();
            int minuteInput = inputScanner.nextInt();

            Calendar currentCalendar = Calendar.getInstance();
            Calendar userCalendar = Calendar.getInstance();
            userCalendar.set(yearInput, monthInput, dayInput, hourInput, minuteInput);

            System.out.println("Текущая дата и время: " + currentCalendar.getTime());
            System.out.println("Введенная дата и время: " + userCalendar.getTime());

            compareDates(currentCalendar, userCalendar);
        }

    }

    private static void compareDates(Calendar current, Calendar user) {
        if (user.before(current)) {
            System.out.println("Введенная дата меньше текущей.");
        } else if (user.after(current)) {
            System.out.println("Введенная дата больше текущей.");
        } else {
            System.out.println("Введенная дата равна текущей.");
        }
    }
}

