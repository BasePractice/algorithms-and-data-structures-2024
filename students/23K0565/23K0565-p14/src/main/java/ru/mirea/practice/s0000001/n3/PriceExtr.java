package ru.mirea.practice.s0000001.n3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PriceExtr {

    private PriceExtr() {
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите текст для извлечения цен:");
            String input = scanner.nextLine();

            String regex = "\\b\\d{1,3}\\.\\d{2}\\s(USD|RUB|EU)\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            System.out.println("Найденные цены:");
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
