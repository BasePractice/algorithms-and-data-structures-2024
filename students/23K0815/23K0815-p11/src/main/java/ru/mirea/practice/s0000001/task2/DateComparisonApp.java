package ru.mirea.practice.s0000001.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class DateComparisonApp {
    // Приватный конструктор для предотвращения создания экземпляров
    private DateComparisonApp() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        // Используем try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату в формате YYYY-MM-DD: ");
            String userInput = scanner.nextLine();

            LocalDate userDate;
            try {
                userDate = LocalDate.parse(userInput, dateFormatter);
            } catch (Exception e) {
                System.out.println("Некорректный формат даты. Пожалуйста, используйте формат YYYY-MM-DD.");
                return;
            }

            if (userDate.isBefore(currentDate)) {
                System.out.println("Введенная дата меньше текущей даты.");
            } else if (userDate.isAfter(currentDate)) {
                System.out.println("Введенная дата больше текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } // Scanner автоматически закроется здесь }
    }
}