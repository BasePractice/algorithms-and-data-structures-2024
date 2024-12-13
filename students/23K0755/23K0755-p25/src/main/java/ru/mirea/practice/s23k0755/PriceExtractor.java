package ru.mirea.practice.s23k0755;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PriceExtractor {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 10.00 RUB, 99.95 EUR";
        Pattern pattern = Pattern.compile("\\b\\d{1,3}(\\.\\d{1,2})? (USD|RUB|EUR)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Цены в USD, RUB, EUR:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
