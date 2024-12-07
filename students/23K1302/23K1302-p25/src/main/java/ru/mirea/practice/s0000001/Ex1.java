package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Ex1 {

    private Ex1() {
        // Скоро новый год...
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            System.out.println("Введите регулярное выражение для разбивки строки:");
            String regex = scanner.nextLine();

            try {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(input);

                System.out.println("Результат разбивки строки:");
                while (matcher.find()) {
                    System.out.println(matcher.group());
                }

                System.out.println("Введите регулярное выражение для поиска:");
                regex = scanner.nextLine();
                matcher = pattern.matcher(input);

                boolean found = false;
                while (matcher.find()) {
                    System.out.println("Найдено совпадение: " + matcher.group());
                    found = true;
                }

                if (!found) {
                    System.out.println("Совпадений не найдено.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка в регулярном выражении: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при работе со Scanner: " + e.getMessage());
        }
    }
}
