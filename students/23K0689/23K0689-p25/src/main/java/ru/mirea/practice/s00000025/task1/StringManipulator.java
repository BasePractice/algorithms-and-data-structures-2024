package ru.mirea.practice.s00000025.task1;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class StringManipulator {

    private StringManipulator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input;

            System.out.println("Введите строку для манипуляции:");
            input = scanner.nextLine();

            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Разделить строку по регулярному выражению");
                System.out.println("2. Заменить все вхождения по регулярному выражению");
                System.out.println("3. Найти все вхождения по регулярному выражению");
                System.out.println("4. Выход");

                System.out.print("Выберите операцию: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите регулярное выражение для разделения: ");
                        String regexSplit = scanner.nextLine();
                        splitString(input, regexSplit);
                        break;
                    case 2:
                        System.out.print("Введите регулярное выражение для замены: ");
                        String regexReplace = scanner.nextLine();
                        System.out.print("Введите строку для замены: ");
                        String replacement = scanner.nextLine();
                        replaceString(input, regexReplace, replacement);
                        break;
                    case 3:
                        System.out.print("Введите регулярное выражение для поиска: ");
                        String regexFind = scanner.nextLine();
                        findMatches(input, regexFind);
                        break;
                    case 4:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;  // Добавлен break для обработки неверного выбора
                }
            }
        }
    }

    private static void splitString(String input, String regex) {
        String[] result = input.split(regex);
        System.out.println("Результат разделения:");
        for (String element : result) {
            System.out.println(element);
        }
    }

    private static void replaceString(String input, String regex, String replacement) {
        String result = input.replaceAll(regex, replacement);
        System.out.println("Результат замены:");
        System.out.println(result);
    }

    private static void findMatches(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println("Найдено: " + matcher.group());
        }
    }
}
