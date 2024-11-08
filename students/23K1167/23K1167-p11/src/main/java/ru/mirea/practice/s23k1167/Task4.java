package ru.mirea.practice.s23k1167;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

/**
 * Напишите пользовательский код, который формирует объекты Date и
 * Calendar по следующим данным, вводимым пользователем:
 * <br>
 * Год Месяц Число<br>
 * Часы минуты
 */

public abstract class Task4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("What year is it?: ");
            int year = sc.nextInt();
            System.out.print("What month is it?: ");
            int month = sc.nextInt();
            System.out.print("What day of the month is it?: ");
            int day = sc.nextInt();
            System.out.print("What hour is it?: ");
            int hour = sc.nextInt();
            System.out.print("What minute is it?: ");
            int minute = sc.nextInt();

            System.out.println(
                    Date.from(
                            LocalDateTime.of(year, month, day, hour, minute).atZone(ZoneId.systemDefault()).toInstant()
                    )
            );
        }
    }
}
