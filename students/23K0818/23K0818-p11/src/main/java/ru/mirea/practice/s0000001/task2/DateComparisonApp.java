package ru.mirea.practice.s0000001.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class DateComparisonApp {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            // Формат даты и времени
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

            // Получение текущей даты и времени
            Date currentDate = new Date();

            // Ввод даты и времени пользователем
            System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss:");
            String userInput = scanner.nextLine();

            // Парсинг введенной даты и времени
            Date userDate = dateFormat.parse(userInput);

            // Сравнение дат
            if (currentDate.after(userDate)) {
                System.out.println("Текущая дата и время позже, чем введенные.");
            } else if (currentDate.before(userDate)) {
                System.out.println("Текущая дата и время раньше, чем введенные.");
            } else {
                System.out.println("Текущая дата и время совпадают с введенными.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты и времени.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
