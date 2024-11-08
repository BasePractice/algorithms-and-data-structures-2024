package ru.mirea.practice.s23k0155.prac11.task1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public abstract class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 14);
        calendar.set(Calendar.MINUTE, 5);
        calendar.set(Calendar.SECOND, 55);
        Date dated = new Date();
        System.out.println(dated);
        System.out.println("Разработчик: Леснов А.В.\nЗадание получил: "
                + sdf.format(calendar.getTime()) + "\nЗадание сдал: "
                + sdf.format(dated.getTime()));
    }
}
