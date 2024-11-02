package ru.mirea.practice.s0000001;

import java.util.Date;

public abstract class Taskn1 {
    public static void main(String[] args) {
        long time1 = 1728037980000L;
        long time2 = 1728038999999L;
        Date dt1 = new Date();
        Date dt2 = new Date();
        dt1.setTime(time1);
        dt2.setTime(time2);
        System.out.println("Developer - Lavrov");
        System.out.println("Date of recieval - " + dt1);
        System.out.println("Date of completion - " + dt2);
    }
}
