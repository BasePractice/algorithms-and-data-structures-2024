package ru.mirea.practice.s23k0135.task3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PriceExtractor {
    public static void main(String[] args) {
        String text = "The price is 25.98 USD, another one is 44.0 RUB, and there is also 100.00 EU. Incorrect: 44 ERR, 0.004 EU.";

        String regex = "\\b\\d+(\\.\\d{1,2})?\\s?(USD|RUB|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
