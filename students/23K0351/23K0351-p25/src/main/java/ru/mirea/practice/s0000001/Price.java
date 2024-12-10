package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public abstract class Price {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 0.004 EU, 100 RUB, 15.00 RUB.";
        List<String> prices = extractPrices(text);
        System.out.println(prices);
    }

    public static List<String> extractPrices(String text) {
        List<String> prices = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\b(\\d+\\.\\d{2})\\s*(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            prices.add(matcher.group());
        }

        return prices;
    }
}
