package ru.mirea.practice.s0000001;

import java.util.Calendar;

class MyDateTimeCreator extends DateTimeCreator {

    @Override
    public void createDate(int year, int month, int day, int hour, int minute) {
        calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);
        date = calendar.getTime();
    }
}
