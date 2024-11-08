package ru.mirea.practice.s27k0112;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class Task4 {
    private Task4() {

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите дату в формате <Год><Месяц><Число> (например, 2024 10 27):");
            int year = sc.nextInt();
            int month = sc.nextInt() - 1;
            int day = sc.nextInt();

            System.out.println("Введите время в формате <Часы><Минуты> (например, 14 30):");
            int hours = sc.nextInt();
            int minutes = sc.nextInt();

            Date date = new Date(year - 1900, month, day, hours, minutes);
            System.out.println("Объект Date: " + date);

            Calendar cal = Calendar.getInstance();
            cal.set(year, month, day, hours, minutes);
            Date calendarDate = cal.getTime();
            System.out.println("Объект Calendar: " + calendarDate);
        }
    }
}
