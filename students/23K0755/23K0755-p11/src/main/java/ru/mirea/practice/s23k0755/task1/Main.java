package ru.mirea.practice.s23k0755.task1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public abstract class Main {

    public static void main(String[] args) {
        final SimpleDateFormat date = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR, -12);
        cal.set(Calendar.MINUTE, 0);
        date.setTimeZone(TimeZone.getTimeZone("GMT+3:00"));

        System.out.println("Dandyl");
        System.out.println("Date when the task was given: " + date.format(cal.getTime()));
        System.out.println("Date when the task was done: " + date.format(System.currentTimeMillis()));
    }
}
