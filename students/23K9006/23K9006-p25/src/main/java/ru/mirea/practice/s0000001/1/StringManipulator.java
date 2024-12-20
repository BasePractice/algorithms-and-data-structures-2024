package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class StringManipulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для манипуляции:");
            String input = scanner.nextLine();

            System.out.println("Введите регулярное выражение для разбиения строки:");
            String regex = scanner.nextLine();

            System.out.println("Результаты разбиения строки:");
            String[] splitResult = input.split(regex);
            for (int i = 0; i < splitResult.length; i++) {
                System.out.println((i + 1) + ": " + splitResult[i]);
            }

            System.out.println("\nВведите регулярное выражение для поиска в строке:");
            regex = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            System.out.println("Результаты поиска в строке:");
            boolean found = false;
            while (matcher.find()) {
                System.out.println("Найдено: " + matcher.group() + " (начало: " + matcher.start() + ", конец: " + matcher.end() + ")");
                found = true;
            }

            if (!found) {
                System.out.println("Совпадений не найдено.");
            }
        }
    }
}
