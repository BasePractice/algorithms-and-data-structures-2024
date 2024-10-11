package ru.mirea.practice.s23k0823.task1.task1;

import java.util.Locale;

public abstract class StringMethods {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        System.out.println("Последний символ: " + str.charAt(str.length() - 1));

        System.out.println("Заканчивается на !!!: " + str.endsWith("!!!"));

        System.out.println("Начинается с I like: " + str.startsWith("I like"));

        System.out.println("Содержит Java: " + str.contains("Java"));

        System.out.println("Позиция Java: " + str.indexOf("Java"));

        System.out.println("Заменить а на о: " + str.replace("a", "o"));

        System.out.println("Верхний регистр: " + str.toUpperCase(Locale.ROOT));

        System.out.println("Нижний регистр: " + str.toLowerCase(Locale.ROOT));

        System.out.println("Подстрока Java: " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}