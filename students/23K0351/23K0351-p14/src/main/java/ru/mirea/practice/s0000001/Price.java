package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Price {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 44 ERR, 1000 RUB, 0.004 EU java, 20.50 EUR, 15.00 RUB.";


        String regex = "\\b\\d+(?:\\.\\d{1,2})?\\s*(USD|RUB|EUR)\\b";
        //
        // \\b — граница слова
        // \\d+ — одна или более цифра
        //(?:\\.\\d{1,2})? — точка и одной или двум цифрам после нее
        // \\s* — ноль или более пробелов
        // (USD|RUB|EUR) — валюты
        // \\b — граница слова


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
