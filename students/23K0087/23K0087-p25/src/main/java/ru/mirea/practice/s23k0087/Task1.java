package ru.mirea.practice.s23k0087;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task1 {
    public static void main(String[] args) {
        String text = "25.98 USD.\n 44 ERR\n 0.004 EU.\n 100.00 RUB,\n 75.50 EUR!";

        String regex = "\\b\\d+\\.\\d{2}\\s+(USD|RUB|EUR)\\b(?=[\n,;!?.]|$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
