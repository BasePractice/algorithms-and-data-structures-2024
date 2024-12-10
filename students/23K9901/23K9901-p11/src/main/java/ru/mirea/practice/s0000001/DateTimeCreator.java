package ru.mirea.practice.s0000001;

import java.util.Calendar;
import java.util.Date;

abstract class DateTimeCreator {
    protected Date date;
    protected Calendar calendar;

    public abstract void createDate(int year, int month, int day, int hour, int minute);

    public void displayDate() {
        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
