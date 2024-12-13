package ru.mirea.practice.s23k0145.lab1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public abstract class CurrencyPriceFinder {
    public static void main(String[] args) {
        String sampleText = "Цены в магазинах: 25.98 USD, 44 ERR, 0.004 EU, 1000 RUB, 75.5 USD.";

        List<String> extractedPrices = findValidPrices(sampleText);

        for (String price : extractedPrices) {
            System.out.println(price);
        }
    }

    public static List<String> findValidPrices(String inputText) {
        List<String> validPrices = new ArrayList<>();

        String pricePattern = "\\b\\d+(?:\\.\\d{1,2})?\\s*(USD|RUB|EUR)\\b";
        Pattern compiledPattern = Pattern.compile(pricePattern);
        Matcher textMatcher = compiledPattern.matcher(inputText);

        while (textMatcher.find()) {
            validPrices.add(textMatcher.group());
        }

        return validPrices;
    }
}
