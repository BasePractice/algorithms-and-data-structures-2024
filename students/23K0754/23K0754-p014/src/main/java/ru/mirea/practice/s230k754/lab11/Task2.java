package ru.mirea.practice.s230k754.lab11;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Task2 {
    private Task2() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите строку для проверки:");
            String input = scanner.nextLine();

            // Регулярное выражение для проверки
            String regex = "^abcdefghijklmnopqrstuv18340$";

            // Проверка соответствия
            boolean matches = Pattern.matches(regex, input);

            if (matches) {
                System.out.println("Строка соответствует заданному шаблону.");
            } else {
                System.out.println("Строка не соответствует заданному шаблону.");
            }

        }
    }
}
