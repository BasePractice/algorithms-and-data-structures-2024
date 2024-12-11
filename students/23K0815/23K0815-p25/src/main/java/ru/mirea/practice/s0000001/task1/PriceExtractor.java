package ru.mirea.practice.s0000001.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public abstract class PriceExtractor {
    public static void main(String[] args) {
        String text = "Вот некоторые цены: 25.98 USD, 44 ERR, 0.004 EU, 1000 RUB, 75.5 USD.";

        List<String> prices = extractPrices(text);

        for (String price : prices) {
            System.out.println(price);
        }
    }

    public static List<String> extractPrices(String text) {
        List<String> prices = new ArrayList<>();

        String regex = "\\b\\d+(?:\\.\\d{1,2})?\\s*(USD|RUB|EUR)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            prices.add(matcher.group());
        }

        return prices;
    }
}