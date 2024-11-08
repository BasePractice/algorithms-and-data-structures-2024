package ru.mirea.practice.s23k0116.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class PriceExtractor {
    public static void main(String[] args) {
        String text = "The product costs 25.98 USD, another is priced at 50.00 RUB,"
            + "and there's one more at 30.50 EU. Wrong prices include 44 ERR, 0.004 EU, and 20.3 USD.";

        // Регулярное выражение для поиска цен
        String pattern = "\\b\\d{1,}\\.\\d{2}\\s(?:USD|RUB|EU)\\b";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
