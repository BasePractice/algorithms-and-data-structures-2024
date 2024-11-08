package ru.mirea.practice.s0000001.prog2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дату (например, 2005-07-07):");
            String inputDate = scanner.nextLine();

            DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate dateTime = LocalDate.parse(inputDate, formater);

            LocalDate now = LocalDate.now();

            if (now.isBefore(dateTime)) {
                System.out.println("Введенная дата и время будет в будущем");
            } else if (now.isAfter(dateTime)) {
                System.out.println("Введенная дата и время - прошлое");
            } else {
                System.out.println("Введенная дата и время совпадают с текущими.");
            }
        }
    }
}
