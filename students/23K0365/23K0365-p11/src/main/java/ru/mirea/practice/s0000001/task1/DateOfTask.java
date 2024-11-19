package ru.mirea.practice.s0000001.task1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class DateOfTask {
    public static void main(String[] args) {
        String a = "Alex P.";
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat df = new SimpleDateFormat("dd MMM yyy");
        GregorianCalendar date1 = new GregorianCalendar(
            2024, Calendar.SEPTEMBER, 8);
        Date date2 = new Date();
        System.out.println("Student - " + a);
        System.out.println("When recieved: " + df.format(date1.getTime()));
        System.out.println("When finished: " + formater.format(date2));
    }
}
