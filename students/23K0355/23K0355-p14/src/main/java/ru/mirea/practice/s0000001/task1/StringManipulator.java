package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringManipulator {

    private StringManipulator() {
        throw new UnsupportedOperationException("Невозможно создать экземпляр утилитарного класса.");
    }

    public static void splitString(String input, String regex) {
        String[] elements = input.split(regex);
        System.out.println("Разделенные элементы:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public static void findPattern(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        System.out.println("Найденные совпадения:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void replacePattern(String input, String regex, String replacement) {
        String result = input.replaceAll(regex, replacement);
        System.out.println("Результат замены:");
        System.out.println(result);
    }

    public static void removePattern(String input, String regex) {
        String result = input.replaceAll(regex, "");
        System.out.println("Результат удаления:");
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите строку:");
            final String input = scanner.nextLine();

            System.out.println("Выберите операцию:");
            System.out.println("1. Разбить строку на элементы");
            System.out.println("2. Найти все вхождения паттерна");
            System.out.println("3. Заменить паттерн");
            System.out.println("4. Удалить паттерн");
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите регулярное выражение:");
            String regex = scanner.nextLine();

            switch (choice) {
                case 1:
                    splitString(input, regex);
                    break;
                case 2:
                    findPattern(input, regex);
                    break;
                case 3:
                    System.out.println("Введите текст для замены:");
                    String replacement = scanner.nextLine();
                    replacePattern(input, regex, replacement);
                    break;
                case 4:
                    removePattern(input, regex);
                    break;
                default:
                    System.out.println("Неверный выбор");
                    break;
            }
        } finally {
            scanner.close();
        }
    }
}
