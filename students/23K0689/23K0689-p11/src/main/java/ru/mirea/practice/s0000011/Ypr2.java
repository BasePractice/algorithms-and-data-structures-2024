package ru.mirea.practice.s0000011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public final class Ypr2 {
    private Ypr2() {
        // По традиции ничего нет
    }

    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Введите дату в формате (yyyy-MM-dd): ");

        try (Scanner scanner = new Scanner(System.in)) {
            String userInput = scanner.nextLine();

            try {
                Date userDate = formatter.parse(userInput);
                Date currentDate = new Date();

                System.out.println("Текущая дата: " + formatter.format(currentDate));
                System.out.println("Введённая дата: " + formatter.format(userDate));

                if (currentDate.after(userDate)) {
                    System.out.println("Текущая дата позже введённой.");
                } else if (currentDate.before(userDate)) {
                    System.out.println("Текущая дата раньше введённой.");
                } else {
                    System.out.println("Текущая и введённая даты совпадают.");
                }
            } catch (ParseException e) {
                System.out.println("Ошибка: неправильный формат даты.");
            }
        }
    }
}
