package ru.mirea.practice.s23k0164.t2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.List;
import java.util.ArrayList;

public final class PriceExtractor {
    private PriceExtractor() {

    }

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUV, 30.00 EU, 44 ERR, 0.004 EU, 10 USD, 0 RUV.";
        String regex = "\\b(0|[1-9]\\d*)(\\.\\d{1,2})?\\s*(USD|RUV|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> prices = new ArrayList<>();
        while (matcher.find()) {
            prices.add(matcher.group());
        }

        System.out.println("Найденные цены:");
        for (String price : prices) {
            System.out.println(price);
        }
    }

}
