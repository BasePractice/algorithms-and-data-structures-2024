package ru.mirea.practice.lab11;

import java.util.Calendar;
import java.util.Scanner;

public abstract class CustomDateCreation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите год: ");
            final int year = scanner.nextInt();
            System.out.println("Введите месяц (1-12): ");
            final int month = scanner.nextInt() - 1;
            System.out.println("Введите день: ");
            final int day = scanner.nextInt();
            System.out.println("Введите часы: ");
            final int hour = scanner.nextInt();
            System.out.println("Введите минуты: ");
            final int minute = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, hour, minute);
            System.out.println("Сформированная дата: " + calendar.getTime());
        }
    }
}
