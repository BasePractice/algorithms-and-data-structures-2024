package ru.mirea.practice.s23k0690;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task4 {

    private Task4() {}

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите текст: ");
            String inputText = scanner.nextLine();
            String regex = "\\b\\d+\\b(?!\\s*\\+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(inputText);
            if (matcher.find()) {
                System.out.println("В тексте есть цифры, за которыми не стоит знак «+».");
            } else {
                System.out.println("Все цифры в тексте корректны.");
            }

        }
    }
}