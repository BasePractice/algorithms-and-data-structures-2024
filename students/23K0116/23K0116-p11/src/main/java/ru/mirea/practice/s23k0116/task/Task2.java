package ru.mirea.practice.s23k0116.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            dateFormat.setLenient(false);

            System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss:");
            String userInput = scanner.nextLine();

            try {
                Date userDate = dateFormat.parse(userInput);

                Date currentDate = new Date();

                System.out.println("Введённая дата и время: " + dateFormat.format(userDate));
                System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));

                if (userDate.before(currentDate)) {
                    System.out.println("Введённая дата и время раньше текущей системной даты.");
                } else if (userDate.after(currentDate)) {
                    System.out.println("Введённая дата и время позже текущей системной даты.");
                } else {
                    System.out.println("Введённая дата и время совпадают с текущей системной датой.");
                }

            } catch (ParseException e) {
                System.out.println("Ошибка: Неверный формат даты. Пожалуйста, следуйте формату dd.MM.yyyy HH:mm:ss.");
            } finally {
                scanner.close();
            }
        }
    }
}
