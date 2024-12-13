package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Currencies {
    private Currencies() {

    }

    private static final String PRICE_REGEX = "(\\d{0,9}\\.\\d{0,9}|\\d{0,9})\\s(USD|RUB|EUR)\\b";
    private static final Pattern pattern = Pattern.compile(PRICE_REGEX);

    public static void main(String[] args) {
        String[] testStrings = {"25.98 USD", "44 ERR", "0.004 EU", "25 RUB"};
        for (String test : testStrings) {
            Matcher matcher = pattern.matcher(test);
            if (matcher.find()) {
                System.out.println("Found price: " + matcher.group());
            } else {
                System.out.println(false);
            }
        }
    }
}
