package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task3 {
    public static void main(String[] args) {
        String text = "Prices: 25.98 USD, 44 ERR, 0.004 EU, 100.50 RUV.";
        String regex = "\\b\\d+\\.\\d{2}\\s(USD|RUV|EU)\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Found price: " + matcher.group());
        }
    }
}
