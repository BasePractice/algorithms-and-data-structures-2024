package ru.mirea.practice.s0000001.task4;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class DateCalendar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String fs = sc.nextLine();
            String ss = sc.nextLine();
            String[] firstLine = fs.split(" ");
            String[] secondLine = ss.split(" ");
            int year = Integer.parseInt(firstLine[0]);
            int month = Integer.parseInt(firstLine[1]);
            int date = Integer.parseInt(firstLine[2]);
            int hours = Integer.parseInt(secondLine[0]);
            int minutes = Integer.parseInt(secondLine[1]);
            Date a = new Date(year - 1900, month - 1, date, hours, minutes);
            GregorianCalendar b = new GregorianCalendar(year, month - 1, date, hours, minutes);
            System.out.println(a);
            System.out.println(b.getTime());
        }
    }
}
