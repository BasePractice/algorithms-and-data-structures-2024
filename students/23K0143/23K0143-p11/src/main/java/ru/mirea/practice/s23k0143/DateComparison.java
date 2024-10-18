package ru.mirea.practice.s23k0143;

import java.util.Date;
import java.util.Scanner;

public abstract class DateComparison {
    public static void main(String[] args) {
        Date currentDate = new Date();
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите дату (гггг-мм-дд): ");
            String inputDate = scanner.nextLine();
            String[] parts = inputDate.split("-");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]) - 1;
            int day = Integer.parseInt(parts[2]);

            Date userDate = new Date(year - 1900, month, day);

            if (currentDate.before(userDate)) {
                System.out.println("Введенная дата в будущем.");
            } else if (currentDate.after(userDate)) {
                System.out.println("Введенная дата в прошлом.");
            } else {
                System.out.println("Введенная дата совпадает с текущей.");
            }

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
