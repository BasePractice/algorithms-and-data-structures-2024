package ru.mirea.practice.s23k0135.task1;


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public abstract class StringManipulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Добро пожаловать в приложение для работы со строками!");
            System.out.println("Введите строку, которую хотите обработать:");
            String input = scanner.nextLine();


            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Разбить строку на слова (по пробелам)");
                System.out.println("2. Разбить строку по регулярному выражению");
                System.out.println("3. Найти совпадения по регулярному выражению");
                System.out.println("4. Заменить подстроки по регулярному выражению");
                System.out.println("5. Выход");
                System.out.print("Введите номер действия: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        splitByWhitespace(input);
                        break;
                    case 2:
                        System.out.print("Введите регулярное выражение для разделения строки: ");
                        String splitRegex = scanner.nextLine();
                        splitByRegex(input, splitRegex);
                        break;
                    case 3:
                        System.out.print("Введите регулярное выражение для поиска совпадений: ");
                        String matchRegex = scanner.nextLine();
                        findMatches(input, matchRegex);
                        break;
                    case 4:
                        System.out.print("Введите регулярное выражение для замены: ");
                        String replaceRegex = scanner.nextLine();
                        System.out.print("Введите строку для замены: ");
                        String replacement = scanner.nextLine();
                        replaceByRegex(input, replaceRegex, replacement);
                        break;
                    case 5:
                        System.out.println("Спасибо за использование приложения!");
                        scanner.close();
                        break;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте еще раз.");
                        break;
                }
            }
        }
    }

    private static void splitByWhitespace(String input) {
        System.out.println("\nРазбиение строки на слова:");
        String[] words = input.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void splitByRegex(String input, String regex) {
        System.out.println("\nРазбиение строки по регулярному выражению:");
        try {
            String[] parts = input.split(regex);
            for (String part : parts) {
                System.out.println(part);
            }
        } catch (Exception e) {
            System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
        }
    }

    private static void findMatches(String input, String regex) {
        System.out.println("\nПоиск совпадений по регулярному выражению:");
        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            boolean found = false;
            while (matcher.find()) {
                System.out.println("Совпадение: " + matcher.group()
                    + " (с " + matcher.start() + " по " + matcher.end() + ")");
                found = true;
            }
            if (!found) {
                System.out.println("Совпадений не найдено.");
            }
        } catch (Exception e) {
            System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
        }
    }

    private static void replaceByRegex(String input, String regex, String replacement) {
        System.out.println("\nЗамена подстрок по регулярному выражению:");
        try {
            String result = input.replaceAll(regex, replacement);
            System.out.println("Результат замены: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
        }
    }
}
