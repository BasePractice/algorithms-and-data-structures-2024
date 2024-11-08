package ru.mirea.practice.s0000001.task1;

import java.util.Locale;

public abstract class StringOperations {
    public static void main(String[] args) {
        String input = "I like Java!!!";

        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        int javaPosition = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPosition);

        String replacedString = input.replace('а', 'о');
        System.out.println("Строка после замены 'а' на 'о': " + replacedString);

        String upperCaseString = input.toUpperCase(Locale.ROOT);
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        String lowerCaseString = input.toLowerCase(Locale.ROOT);
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        String substringJava = input.substring(javaPosition, javaPosition + "Java".length());
        System.out.println("Вырезанная подстрока: " + substringJava);
    }
}
