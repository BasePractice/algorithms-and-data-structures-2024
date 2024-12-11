package ru.mirea.practice.s0000001.task1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.List;

public final class PriceExtractor {

    // Private constructor to prevent instantiation
    private PriceExtractor() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void main(String[] args) {
        // Пример текста со списком цен
        String text = "Некоторые цены: 25.98 USD, 44 ERR, 100.00 RUB, 0.004 EU, 50.50 EU, 200 RUB, 80.00 USD.";

        // Регулярное выражение для извлечения цен в USD, RUB, EU
        String regex = "\\b\\d+(\\.\\d{1,2})?\\s(USD|RUB|RUR|EUR)\\b";

        // Создаем паттерн и matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Список для хранения найденных цен
        List<String> prices = new ArrayList<>();

        // Ищем все подходящие цены
        while (matcher.find()) {
            prices.add(matcher.group());
        }

        // Выводим результат
        System.out.println("Найденные цены:");
        for (String price : prices) {
            System.out.println(price);
        }
    }
}