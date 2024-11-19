package ru.mirea.practice.s23k0130;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Task1 {

    private Task1() {

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
            dateFormat.setLenient(false);

            System.out.println("Введите фамилию");
            String lastName = scanner.nextLine();

            System.out.println("Введите дату и время в формате dd.MM.yyyy HH:mm:ss");
            String userInput = scanner.nextLine();

            try {
                Date userDate = dateFormat.parse(userInput);
                Date currentDate = new Date();
                System.out.println("Фамилия разработчика: " + lastName);
                System.out.println("Введённая дата и время: " + dateFormat.format(userDate));
                System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));

            } catch (ParseException e) {
                System.out.println("Ошибка: Неверный ввод.");
            } finally {
                scanner.close();
            }
        }
    }
}
