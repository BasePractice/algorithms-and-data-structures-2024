package ru.mirea.practice.s23k0690;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public final class Task4 {
    private Task4() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год (например, 2023): ");
            final int year = scanner.nextInt();
            System.out.print("Введите месяц (1-12): ");
            final int month = scanner.nextInt();
            System.out.print("Введите число (1-31): ");
            final int day = scanner.nextInt();
            System.out.print("Введите часы (0-23): ");
            final int hours = scanner.nextInt();
            System.out.print("Введите минуты (0-59): ");
            final int minutes = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day, hours, minutes, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            SimpleDateFormat calendarFormat = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Созданный объект Calendar: " + calendarFormat.format(calendar.getTime()));
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
            Date date = calendar.getTime();
            System.out.println("Созданный объект Date: " + dateFormat.format(date));
        }
    }
}
