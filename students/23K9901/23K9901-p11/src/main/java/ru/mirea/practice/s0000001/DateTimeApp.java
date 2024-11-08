package ru.mirea.practice.s0000001;

import java.util.Scanner;

abstract class DateTimeApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите год (например, 2023):");
            final int year = scanner.nextInt();

            System.out.println("Введите месяц (1-12):");
            final int month = scanner.nextInt();

            System.out.println("Введите число (1-31):");
            final int day = scanner.nextInt();

            System.out.println("Введите часы (0-23):");
            final int hour = scanner.nextInt();

            System.out.println("Введите минуты (0-59):");
            final int minute = scanner.nextInt();

            final MyDateTimeCreator dateTimeCreator = new MyDateTimeCreator();
            dateTimeCreator.createDate(year, month, day, hour, minute);
            dateTimeCreator.displayDate();
        }
    }
}
