package ru.mirea.practice.s23k0690;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class Task2 {
    private Task2() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            LocalDateTime currentDateTime = LocalDateTime.now();
            System.out.println("Текущая дата и время: " + currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
            System.out.print("Введите дату и время (ГГГГ-ММ-ДД ЧЧ:ММ:СС (Пример:2024-10-29 12:43:29)): ");
            String userInput = scanner.nextLine();
            LocalDateTime userDateTime = LocalDateTime.parse(userInput, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            if (userDateTime.isBefore(currentDateTime)) {
                System.out.println("Введенная дата и время раньше текущего времени.");
            } else if (userDateTime.isAfter(currentDateTime)) {
                System.out.println("Введенная дата и время позже текущего времени.");
            } else {
                System.out.println("Введенная дата и время совпадает с текущим временем.");
            }
        }
    }
}