package ru.mirea.practice.s23l0908;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2024);
        cal.set(Calendar.MONTH, Calendar.OCTOBER);
        cal.set(Calendar.DAY_OF_MONTH, 12);
        System.out.println("Time to get task:" + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, 19);
        System.out.println("Time to do task: " + sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, 27);
        System.out.println("Last day to do the task:" + sdf.format(cal.getTime()));
    }
}
