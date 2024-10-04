package ru.mirea.practice.s23k0164.t2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public final class DateComparison {

    private DateComparison() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println("Введите дату в формате yyyy-MM-dd:");
            String userInput = scanner.nextLine();

            try {
                LocalDate userDate = LocalDate.parse(userInput, dateFormatter);

                LocalDate currentDate = LocalDate.now();

                if (userDate.isBefore(currentDate)) {
                    System.out.println("Введенная дата раньше текущей даты.");
                } else if (userDate.isAfter(currentDate)) {
                    System.out.println("Введенная дата позже текущей даты.");
                } else {
                    System.out.println("Введенная дата совпадает с текущей датой.");
                }

                LocalTime currentTime = LocalTime.now();
                System.out.println("Текущее системное время: " + currentTime);

            } catch (DateTimeParseException e) {
                System.out.println("Неверный формат даты. Пожалуйста, введите дату в формате yyyy-MM-dd.");
            } finally {
                scanner.close();
            }
        }
    }

}
