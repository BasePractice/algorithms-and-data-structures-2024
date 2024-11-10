package ru.mirea.practice.s23k1168.task3;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task3 {

    private Task3() {

    }

    public static void main(String[] args) {
        String text = "25.98 USD.\n"
                + "44 ERR\n"
                + "0.004 EU.\n"
                + "100.00 RUB,\n"
                + "75.50 EUR!";

        String regex = "\\b\\d+\\.\\d{2}\\s+(USD|RUB|EUR)\\b(?=[\\.,;!?]|$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
