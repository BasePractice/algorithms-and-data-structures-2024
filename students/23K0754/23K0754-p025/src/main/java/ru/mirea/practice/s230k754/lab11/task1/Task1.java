package ru.mirea.practice.s230k754.lab11.task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task1 {
    private Task1() {}

    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Строка разбивки: ");
            String input = scanner.nextLine();

            System.out.println("Элемент для разбивки: ");
            String regex = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            System.out.println("Результат разбивки:");
            int start = 0;
            while (matcher.find()) {
                String element = input.substring(start, matcher.start());
                if (!element.isEmpty()) {
                    System.out.println(element);
                }
                start = matcher.end();
            }
            String lastElement = input.substring(start);
            if (!lastElement.isEmpty()) {
                System.out.println(lastElement);
            }
        }
    }
}
