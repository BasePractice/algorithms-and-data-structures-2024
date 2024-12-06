package ru.mirea.practice.s23l0908.task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String text = "The prices are as follows: "
            +
            "25.98 USD, 3000 RUB, 44 ERR, 12.99 EUR, 0.004 EU, and 15.5 USD. "
            +
            "Please review these values.";

        String regex = "\\b\\d{1,6}(\\.\\d{1,2})?\\s*(USD|RUB|EUR)\\b";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        List<String> prices = new ArrayList<>();

        while (matcher.find()) {
            prices.add(matcher.group());
        }

        // Print extracted prices
        System.out.println("Extracted prices:");
        for (String price : prices) {
            System.out.println(price);
        }
    }
}

