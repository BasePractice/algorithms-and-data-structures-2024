package ru.mirea.practice.s0000001.n4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class DateTimeInput {
    private DateTimeInput() {}

    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            final int year = scn.nextInt();

            System.out.print("Введите месяц (1-12): ");
            final int month = scn.nextInt() - 1;

            System.out.print("Введите число: ");
            final int day = scn.nextInt();

            System.out.print("Введите часы: ");
            final int hour = scn.nextInt();

            System.out.print("Введите минуты: ");
            final int minute = scn.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(year, month, day, hour, minute);
            Date date = cal.getTime();

            System.out.println("Созданная дата (Date): " + date);
            System.out.println("Созданная дата (Calendar): " + cal.getTime());
        }
    }
}
