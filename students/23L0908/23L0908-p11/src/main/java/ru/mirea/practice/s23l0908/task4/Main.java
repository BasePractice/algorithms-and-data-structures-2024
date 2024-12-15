package ru.mirea.practice.s23l0908.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter year: ");
            final int year = in.nextInt();
            System.out.print("Enter month: ");
            final int month = in.nextInt();
            System.out.print("Enter date: ");
            final int date = in.nextInt();
            System.out.print("Enter hours: ");
            final int hours = in.nextInt();
            System.out.print("Enter minute: ");
            final int minute = in.nextInt();
            final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd\nHH:mm");
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month);
            calendar.set(Calendar.DAY_OF_MONTH, date);
            calendar.set(Calendar.HOUR, hours);
            calendar.set(Calendar.MINUTE, minute);
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}

