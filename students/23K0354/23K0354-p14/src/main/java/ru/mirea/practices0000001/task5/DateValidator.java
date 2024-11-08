package ru.mirea.practices0000001.task5;

import java.util.regex.Pattern;

public abstract class DateValidator {
    public static void main(String[] args) {
        String[] correctDates = {"29/02/2000", "30/04/2003", "01/01/2003"};
        String[] incorrectDates = {"29/02/2001", "30-04-2003", "1/1/1899"};

        String pattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/((19|20)\\d{2})$";

        for (String date : correctDates) {
            if (Pattern.matches(pattern, date)) {
                String[] parts = date.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                if (month == 2 && day == 29 && !isLeapYear(year)) {
                    System.out.println(date + " - неправильная дата (29 февраля не является високосным годом)");
                } else {
                    System.out.println(date + " - правильная дата");
                }
            } else {
                System.out.println(date + " - неправильная дата");
            }
        }

        for (String date : incorrectDates) {
            if (Pattern.matches(pattern, date)) {
                String[] parts = date.split("/");
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                if (month == 2 && day == 29 && !isLeapYear(year)) {
                    System.out.println(date + " - неправильная дата (29 февраля не является високосным годом)");
                } else {
                    System.out.println(date + " - правильная дата");
                }
            } else {
                System.out.println(date + " - неправильная дата");
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
