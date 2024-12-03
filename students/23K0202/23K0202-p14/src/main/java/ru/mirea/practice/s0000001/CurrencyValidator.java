package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class CurrencyValidator {
    private CurrencyValidator() {

    }

    private static final String CURRENCY_PATTERN = "(\\d{0,9}\\.\\d{0,9}|\\d{0,9})\\s(USD|RUB|EUR)\\b";
    private static final Pattern compiledPattern = Pattern.compile(CURRENCY_PATTERN);

    public static void main(String[] args) {
        String[] sampleInputs = {"109.20 USD", "23.2 EOW", "0.02 EUR", "104 RUB"};
        validateCurrencies(sampleInputs);
    }

    private static void validateCurrencies(String[] inputs) {
        for (String input : inputs) {
            Matcher matcher = compiledPattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Valid price detected: " + matcher.group());
            } else {
                System.out.println("Invalid price format: " + input);
            }
        }
    }
}