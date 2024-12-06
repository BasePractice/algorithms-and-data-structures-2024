package ru.mirea.practice.s23l0908.task2;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Enter date (yyyy-MM-DD): ");
            String dateStr = in.nextLine();
            Calendar cal1 = Calendar.getInstance();
            Calendar cal2 = Calendar.getInstance();
            cal1.setTime(new Date());
            try {
                Date date = sdf.parse(dateStr);
                cal2.setTime(date);

                if (cal1.after(cal2)) {
                    System.out.println(sdf.format(cal1.getTime()) + " is after " + sdf.format(cal2.getTime()));
                } else if (cal2.after(cal1)) {
                    System.out.println(sdf.format(cal1.getTime()) + " is before " + sdf.format(cal2.getTime()));
                } else {
                    System.out.println(sdf.format(cal1.getTime()) + " is equal to " + sdf.format(cal2.getTime()));
                }
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
            }
        }
    }
}
