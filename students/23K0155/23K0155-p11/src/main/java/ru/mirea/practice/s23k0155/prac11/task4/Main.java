package ru.mirea.practice.s23k0155.prac11.task4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите год, месяц, день, час и минуты");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR, hour);
            calendar.set(Calendar.MINUTE, minute);
            Date date = new Date(year - 1900, month - 1, day);
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy MMMM dd");
            System.out.println(sdfDate.format(date));
            SimpleDateFormat sdfCalender = new SimpleDateFormat("HH:mm");
            System.out.println(sdfCalender.format(calendar.getTime()));
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
