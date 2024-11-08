package ru.mirea.practice.s0000001.task2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class CompareDates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            GregorianCalendar dateFirst = new GregorianCalendar();
            DateFormat df = new SimpleDateFormat("dd MMM yyy");
            System.out.println("Enter year(int):");
            int year = sc.nextInt();
            System.out.println("Enter month(int):");
            int month = sc.nextInt() - 1;
            System.out.println("Enter date:");
            int date = sc.nextInt();
            GregorianCalendar secondDate = new GregorianCalendar(year, month, date);
            System.out.println("Today is " + df.format(dateFirst.getTime()));
            System.out.printf("Defintion\nDays: %d%nMonths: %d%nYears: %d",
                    Math.abs(dateFirst.get(Calendar.DATE) - secondDate.get(Calendar.DATE)),
                    Math.abs(dateFirst.get(Calendar.MONTH) - secondDate.get(Calendar.MONTH)),
                    Math.abs(dateFirst.get(Calendar.YEAR) - secondDate.get(Calendar.YEAR)));
        }
    }
}
