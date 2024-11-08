package ru.mirea.practice.lab13;

import java.util.Locale;

public abstract class StringAnalyzer {
    public static void analyzeString(String str) {

        System.out.println("Последний символ строки: " + str.charAt(str.length() - 1));

        System.out.println("Заканчивается на '!!!': " + str.endsWith("!!!"));

        System.out.println("Начинается с 'I like': " + str.startsWith("I like"));

        System.out.println("Содержит 'Java': " + str.contains("Java"));

        System.out.println("Позиция 'Java': " + str.indexOf("Java"));

        String replacedStr = str.replace('a', 'o');
        System.out.println("После замены 'a' на 'o': " + replacedStr);

        System.out.println("В верхнем регистре: " + str.toUpperCase(Locale.getDefault()));

        System.out.println("В нижнем регистре: " + str.toLowerCase(Locale.getDefault()));

        int javaIndex = str.indexOf("Java");
        if (javaIndex != -1) {
            String substringJava = str.substring(javaIndex, javaIndex + 4);
            System.out.println("Вырезанная подстрока 'Java': " + substringJava);
        } else {
            System.out.println("Подстрока 'Java' не найдена");
        }
    }

    public static void main(String[] args) {
        String testString = "I like Java!!!";
        analyzeString(testString);
    }
}

