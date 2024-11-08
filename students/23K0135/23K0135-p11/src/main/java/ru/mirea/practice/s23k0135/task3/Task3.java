package ru.mirea.practice.s23k0135.task3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public abstract class Task3 {
    public static void main(String[] args) {
        // Ввод данных
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год: ");
            final int year = scanner.nextInt();
            System.out.print("Введите месяц (1-12): ");
            final int month = scanner.nextInt();
            System.out.print("Введите число: ");
            final int datte = scanner.nextInt();
            System.out.print("Введите часы: ");
            final int hours = scanner.nextInt();
            System.out.print("Введите минуты: ");
            final int mins = scanner.nextInt();

            // Создание объекта Calendar
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1); //январь = 0
            calendar.set(Calendar.DAY_OF_MONTH, datte);
            calendar.set(Calendar.HOUR_OF_DAY, hours);
            calendar.set(Calendar.MINUTE, mins);
            calendar.set(Calendar.SECOND, 0); // 0 секунд по умолчанию

            // Получение объекта Date из Calendar
            Date date = calendar.getTime();

            // Вывод результатов
            System.out.println("объект Date: " + date);
            System.out.println("объект Calendar: " + calendar.getTime());
        }
    }
}
