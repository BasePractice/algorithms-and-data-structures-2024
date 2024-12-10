package ru.mirea.practice.s0000001.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public abstract class NumberChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст для проверки:");
            String text = scanner.nextLine();

            boolean hasInvalidNumbers = checkForInvalidNumbers(text);

            if (hasInvalidNumbers) {
                System.out.println("Текст содержит цифры, за которыми не стоит знак '+'.");
            } else {
                System.out.println("Все цифры корректны.");
            }
        }
    }

    public static boolean checkForInvalidNumbers(String text) {
        String regex = "\\b\\d+\\b(?!\\s*\\+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}