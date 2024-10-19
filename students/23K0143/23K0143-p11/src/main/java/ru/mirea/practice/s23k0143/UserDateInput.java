package ru.mirea.practice.s23k0143;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class UserDateInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату (гггг мм дд): ");
            int year = scanner.nextInt();
            int month = scanner.nextInt() - 1;
            int day = scanner.nextInt();

            System.out.println("Введите время (Часы Минуты): ");
            int hour = scanner.nextInt();
            int minute = scanner.nextInt();

            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, day, hour, minute);

            Date date = calendar.getTime();
            System.out.println("Введенная дата и время: " + date);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
