package ru.mirea.practice.s0000001.num2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class Main {
    private Main() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    }

    public static void main(String[] args) {
        String text = "25.98 USD, 44 ERR, 0.004 EU, 100.50 RUB, 500 EUR, 1234.56 USD";
        Pattern p = Pattern.compile("\\d+(\\.\\d+)?\\s?(USD|RUB|EUR)");
        Matcher m = p.matcher(text);
        System.out.println("Извлеченные цены:");
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
