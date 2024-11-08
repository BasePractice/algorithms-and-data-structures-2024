package ru.mirea.practice.s0000001.prog4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<LocalDateTime> list = new ArrayList<>();

            System.out.println("Введите год, месяц, день, час, минуту (через пробел): ");
            System.out.println("Для завершения работы нажмите Enter");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd HH mm");

            while (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();

                if (inputLine.isEmpty()) {
                    break;
                }

                try {
                    LocalDateTime inputTime = LocalDateTime.parse(inputLine, formatter);
                    list.add(inputTime);
                } catch (Exception e) {
                    System.out.println("Неверный формат ввода. Пожалуйста, введите год, месяц, день, час,"
                            + " минуту через пробел.");
                }
            }

            System.out.println("Введенные даты и время:");
            for (LocalDateTime time : list) {
                System.out.println(time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
            }
        }
    }
}
