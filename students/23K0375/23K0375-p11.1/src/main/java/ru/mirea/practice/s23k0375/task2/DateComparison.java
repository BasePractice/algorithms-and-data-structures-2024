package ru.mirea.practice.s23k0375.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class DateComparison {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Введите дату и время в формате 'yyyy-MM-dd HH:mm:ss':");
            String userInput = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date userDate = dateFormat.parse(userInput);

            Date currentDate = new Date();

            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата и время раньше текущей даты и времени.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата и время позже текущей даты и времени.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей датой и временем.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты. Пожалуйста, используйте формат 'yyyy-MM-dd HH:mm:ss'.");
        } finally {
            scanner.close();
        }
    }
}
