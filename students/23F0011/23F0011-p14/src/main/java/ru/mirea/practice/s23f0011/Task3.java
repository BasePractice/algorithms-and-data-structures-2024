package ru.mirea.practice.s23f0011;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Task3 {
    public static void main(String[] args) {
        String text = "Цена товара 25.98 USD. Другой товар стоит 100.00 RUB. "
            + "Еще один продукт: 50.5 EU. "
            + "Неверные значения: 44 ERR";

        Pattern pattern = Pattern.compile("(?<price>\\d+(?:\\.\\d+)?)(\\s+)(?<currency>(USD|RUB|EU))");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            System.out.println("Цена: " + matcher.group("price") + " " + matcher.group("currency"));
        }
    }
}
