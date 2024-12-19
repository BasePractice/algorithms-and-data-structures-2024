package ru.mirea.practice.s23k0623;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Three {
    private Three() {

    }

    public static void main(String[] args) {
        String text = "Here are some prices: 25.98 USD, 44 ERR, 0.004 EU, 123.45 RUR, 67.89 EUR, 100 USD, 200.50 RUB.";
        extractPrices(text);
    }

    public static void extractPrices(String text) {
        String regex = "\\b\\d+(\\.\\d{1,2})?\\s(USD|RUB|RUR|EUR)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
