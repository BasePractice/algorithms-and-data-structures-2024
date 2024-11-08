package ru.mirea.practice.s23k0350.task1;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;


abstract class Comparer {
    public static void main(String[] args) {
        Date oldd = new Date();
        SimpleDateFormat form = new SimpleDateFormat("HH:mm, d MMMM, yyyy");
        System.out.println("Сегодняшняя дата: "
                + form.format(oldd)
                + " года.");
        System.out.print("Введите дату, с которой хотите сравнить.\nВведите число: ");
        try (Scanner sc = new Scanner(System.in)) {
            int day = sc.nextInt();
            System.out.print("Введите номер месяца: ");
            int month = sc.nextInt();
            System.out.print("Введите год: ");
            int year = sc.nextInt();
            System.out.print("Введите час: ");
            int hour = sc.nextInt();
            System.out.print("Введите минуты: ");
            int mins = sc.nextInt();
            Calendar newd = new GregorianCalendar(year, month - 1, day, hour, mins);
            Date sravn = newd.getTime();
            System.out.println("--- Ваша дата: "
                    + form.format(newd.getTime())
                    + " года. ---");
            System.out.println("--- Сегодняшняя дата: "
                    + form.format(oldd)
                    + " года. ---");

            if (oldd.getTime() < sravn.getTime()) {
                System.out.println("Ваша дата позже.");
            }

            if (oldd.getTime() > sravn.getTime()) {
                System.out.println("Ваша дата раньше.");
            }

            if (oldd.getTime() == sravn.getTime()) {
                System.out.println("Ваша дата раньше.");
            }
            //Пасхалка!
            if (hour == 20 && mins == 31) {
                System.out.println("20:31. Прибыл Годжо Сатору.");

            }
        }


    }
}