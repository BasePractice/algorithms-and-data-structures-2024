package ru.mirea.practice.s0000001.task2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public abstract class DateComparison {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату (дд-MM-yyyy): ");
            String userInput = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date userDate;

            try {
                userDate = dateFormat.parse(userInput);
                DateUtils.compareDates(userDate);
            } catch (ParseException e) {
                System.out.println("Некорректный формат даты. Пожалуйста, используйте формат дд-MM-yyyy.");
            }
        }
    }
}
