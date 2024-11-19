package ru.mirea.practice.s23k1167;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Приложение, сравнивающее текущую дату и дату, введенную
 * пользователем c текущим системным временем
 */

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What year is it?: ");
            final int year = sc.nextInt();
            System.out.print("What month is it?: ");
            final int month = sc.nextInt();
            System.out.print("What day of the month is it?: ");
            final int day = sc.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.HOUR, 0);
            cal.set(Calendar.MINUTE, 0);
            cal.set(Calendar.SECOND, 0);
            cal.set(Calendar.MILLISECOND, 0);
            cal.set(Calendar.HOUR_OF_DAY, 0);

            Date date = cal.getTime();
            System.out.println(cal);

            LocalDateTime inputDate = LocalDateTime.of(year, month, day, 0, 0);
            Date inpDate = Date.from(inputDate.atZone(ZoneId.systemDefault()).toInstant());

            System.out.println(date);
            System.out.println(inpDate);
            System.out.println(date.getTime());
            System.out.println(inpDate.getTime());

            if (date.compareTo(inpDate) == 0) {
                System.out.println("Даты совпадают.");
            } else if (date.compareTo(inpDate) > 0) {
                System.out.println("Введённая дата в далёком будущем.");
            } else {
                System.out.println("Введённая дата давно в прошлом.");
            }
        }
    }
}
