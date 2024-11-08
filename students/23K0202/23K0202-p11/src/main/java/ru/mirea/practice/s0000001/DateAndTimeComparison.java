package ru.mirea.practice.s0000001;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class DateAndTimeComparison {
    private DateAndTimeComparison() {

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

            Date date = new Date(yearInput - 1900, monthInput, dayInput, hourInput, minuteInput);
            System.out.println("Объект Date: " + date);

            Calendar cal = Calendar.getInstance();
            cal.set(yearInput, monthInput, dayInput, hourInput, minuteInput);
            Date calendarDate = cal.getTime();
            System.out.println("Объект Calendar: " + calendarDate);
        }
    }
}
