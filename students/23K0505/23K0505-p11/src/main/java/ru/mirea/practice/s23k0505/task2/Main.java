package ru.mirea.practice.s23k0505.task2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public abstract class Main {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter current day of month: ");
            day = scanner.nextInt();
            System.out.print("Enter number of current month: ");
            month = scanner.nextInt();
            System.out.print("Enter current year: ");
            year = scanner.nextInt();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+3:00"));
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);

        Date inputDate = new Date(calendar.getTimeInMillis());

        long currDateMillis = System.currentTimeMillis();
        Date currDate = new Date(currDateMillis);

        if (currDate.compareTo(inputDate) > 0) {
            System.out.println("This date is earlier than current date");
        } else if (currDate.compareTo(inputDate) < 0) {
            System.out.println("This date is later than current date");
        } else {
            System.out.println("This date equals current date");
        }
    }
}
