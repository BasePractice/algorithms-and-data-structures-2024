package ru.mirea.practice.u23k1158.t1.t2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Three {
    private Three() {

    }

    public static void main(String[] args) {
        String text = "Here are some prices: 25.90 USD, 100 ERR, 0.04 EU, 354.45 RUR, 69.89 EUR, 100 USD, 240.50 RUB.";
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