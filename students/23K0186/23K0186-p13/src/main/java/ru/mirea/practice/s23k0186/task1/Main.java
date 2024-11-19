package ru.mirea.practice.s23k0089.task1;

import java.util.Locale;

public abstract class Main {

    public static void main(String[] args) {
        String input = "I like Java!!!";

        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается ли '!!!': " + endsWithExclamation);

        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        int javaPosition = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPosition);

        String replacedString = input.replace('a', 'о');
        System.out.println("Замена 'а' на 'о': " + replacedString);

        String upperCaseString = input.toUpperCase(Locale.getDefault());
        System.out.println("Верхний регистр: " + upperCaseString);

        String lowerCaseString = input.toLowerCase(Locale.getDefault());
        System.out.println("Нижний регистр: " + lowerCaseString);

        String substringJava = input.substring(javaPosition, javaPosition + "Java".length());
        System.out.println("Вырезанная строка: " + substringJava);
    }
}
