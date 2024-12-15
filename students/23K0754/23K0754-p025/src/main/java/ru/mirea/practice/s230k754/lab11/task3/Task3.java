package ru.mirea.practice.s230k754.lab11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task3 {
    private Task3() {}

    public static void main(final String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.nextLine();

            String regex = "(\\d+\\.\\d{2})\\s*(USD|RUB|EUR)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            System.out.println("Извлеченные цены:");
            while (matcher.find()) {
                String price = matcher.group(1);
                String currency = matcher.group(2);
                System.out.printf("%s %s%n", price, currency);
            }
        }
    }
}
