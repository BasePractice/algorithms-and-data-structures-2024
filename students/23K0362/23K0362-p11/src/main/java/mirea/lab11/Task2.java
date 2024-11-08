package ru.mirea.lab11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/*
Задание 2.
Приложение, сравнивающее текущую дату и дату, введенную
пользователем с текущим системным временем
 */

public class Task2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите дату в формате YYYY-MM-DD > ");
            String input = sc.nextLine();

            try {
                LocalDate inputDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LocalDate nowDate = LocalDate.now();
                if (inputDate.isAfter(nowDate)) {
                    System.out.println("Введённая дата больше системной");
                } else if (inputDate.isBefore(nowDate)) {
                    System.out.println("Введённая дата меньше системной");
                } else {
                    System.out.println("Введённая дата эквивалентна системной");
                }
            } catch (DateTimeParseException e) {
                System.out.println("Дата введена не по формату YYYY-MM-DD");
            }
        }
    }
}
