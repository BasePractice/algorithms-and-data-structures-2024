package ru.mirea.practice.s0000001.prog3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        String text = "The prices are as follows: 25.98 USD, 44 RUB, 0.004 EUR, 123.50 EUR, 99.99 USD, 1.5 RUB, 0.00 USD.";

        Pattern pattern = Pattern.compile("\\b[1-9]\\d*(\\.\\d{1,2})?\\s+(USD|RUB|EUR)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные правильные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
