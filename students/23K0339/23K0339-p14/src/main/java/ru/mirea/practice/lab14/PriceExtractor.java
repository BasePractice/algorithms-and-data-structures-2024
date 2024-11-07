package ru.mirea.practice.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 EUR, 56.70 RUB, 0.004 EU";

        Pattern pattern = Pattern.compile("\\b\\d+\\.\\d{2} (USD|RUB|EUR)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

