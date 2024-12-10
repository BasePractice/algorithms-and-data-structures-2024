package ru.mirea.practice.s0000001.n4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ChePlu {

    private ChePlu() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст для проверки:");
            String input = scanner.nextLine();

            String regex = "\\d(?!\\s*\\+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            boolean hasNoPlus = false;
            while (matcher.find()) {
                System.out.println("Найдена цифра без знака +: " + matcher.group());
                hasNoPlus = true;
            }

            if (!hasNoPlus) {
                System.out.println("Все цифры имеют знак + после себя!");
            }
        }
    }
}
