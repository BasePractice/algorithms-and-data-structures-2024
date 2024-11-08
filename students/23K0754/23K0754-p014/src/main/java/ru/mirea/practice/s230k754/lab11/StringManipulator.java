package ru.mirea.practice.s230k754.lab11;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringManipulator {
    private StringManipulator() {}

    public static void findElements(String @NotNull [] elements, String regex) {
        Pattern pattern = Pattern.compile(regex);
        System.out.println("Найденные элементы:");
        for (String element : elements) {
            Matcher matcher = pattern.matcher(element.trim());
            if (matcher.find()) {
                System.out.println(element.trim());
            }
        }
    }

    public static void replaceElements(String @NotNull [] elements, String regex, String replacement) {
        System.out.println("Замененные элементы:");
        for (String element : elements) {
            String replaced = element.trim().replaceAll(regex, replacement);
            System.out.println(replaced);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку для разбивки:");
            String input = scanner.nextLine();

            System.out.println("Введите регулярное выражение для разбивки (например, '[,; ]'):");
            String regex = scanner.nextLine();

            // Разбиваем строку по регулярному выражению
            String[] elements = input.split(regex);

            System.out.println("Разделенные элементы:");
            for (String element : elements) {
                System.out.println(element.trim());
            }

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Найти элемент по регулярному выражению");
                System.out.println("2. Заменить элемент по регулярному выражению");
                System.out.println("3. Выход");
                final int choice = scanner.nextInt();
                scanner.nextLine(); // очистка буфера

                switch (choice) {
                    case 1:
                        System.out.println("Введите регулярное выражение для поиска:");
                        String searchRegex = scanner.nextLine();
                        findElements(elements, searchRegex);
                        break;
                    case 2:
                        System.out.println("Введите регулярное выражение для замены:");
                        String replaceRegex = scanner.nextLine();
                        System.out.println("Введите строку замены:");
                        String replacement = scanner.nextLine();
                        replaceElements(elements, replaceRegex, replacement);
                        break;
                    case 3:
                        System.out.println("Выход из программы.");
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                        break;
                }
            }
        }
    }
}

