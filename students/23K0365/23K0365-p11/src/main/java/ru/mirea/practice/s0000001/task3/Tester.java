package ru.mirea.practice.s0000001.task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Tester {
    public static void main(String[] args) {
        Student a = new Student(12, "Bale",
                new GregorianCalendar(2005, Calendar.AUGUST, 23),
                "f");
        System.out.println(a);
    }
}
