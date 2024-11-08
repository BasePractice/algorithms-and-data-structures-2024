package ru.mirea.practice.s23k0135.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task3 {

    public static void main(String[] args) {
        String text = "The price is 25.98 USD. The other product costs 100 RUB. Another item is 10.5 EU.";

        Pattern pattern = Pattern.compile("\\d+(?:\\.\\d+)?\\s+(?:USD|RUB|EU)");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("Found price: " + matcher.group());
        }
    }
}

