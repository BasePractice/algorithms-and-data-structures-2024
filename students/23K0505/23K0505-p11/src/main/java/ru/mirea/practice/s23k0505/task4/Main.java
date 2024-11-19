package ru.mirea.practice.s23k0505.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Main {

    public static int checkInput(int minVal, int maxVal, Scanner scanner) {
        int val;
        do {
            val = scanner.nextInt();
            if (val < minVal || val > maxVal) {
                System.out.printf("%d is not in range [%d, %d]\nInput value again: ", val, minVal, maxVal);
            }
        } while (val < minVal || val > maxVal);
        return val;
    }

    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd.MM.YYYY");
        Calendar calendar = Calendar.getInstance();
        Date date;
        int year;
        int month;
        int day;
        int hour;
        int minute;
        try (Scanner scanner = new Scanner(System.in)) {
            // Simplest validation, doesn't support cases such as February 30th and etc.
            System.out.print("Year: ");
            year = scanner.nextInt();
            System.out.print("Month: ");
            month = checkInput(1, 12, scanner);
            System.out.print("Day: ");
            day = checkInput(1, 31, scanner);
            System.out.print("Hours: ");
            hour = checkInput(0, 23, scanner);
            System.out.print("Minutes: ");
            minute = checkInput(0, 59, scanner);
        }
        calendar.set(year, month - 1, day, hour, minute);
        date = calendar.getTime();
        System.out.println(sdf.format(calendar.getTime()));
        System.out.println(sdf.format(date));
    }
}
