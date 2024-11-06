package ru.mirea.practice.s23k0143;

import java.util.Locale;

public abstract class StringManipulation {

    public static void main(String[] args) {
        String input = "I like Java!!!";

        // 1. Распечатать последний символ строки.
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 2. Проверка, заканчивается ли строка подстрокой "!!!".
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // 3. Проверка, начинается ли строка подстрокой "I like".
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        // 4. Проверка, содержит ли строка подстроку "Java".
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // 5. Найти позицию подстроки "Java" в строке.
        int javaPosition = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPosition);

        // 6. Заменить все символы "а" на "о".
        String replacedString = input.replace('a', 'о');
        System.out.println("Замена 'а' на 'о': " + replacedString);

        // 7. Преобразовать строку к верхнему регистру.
        String upperCaseString = input.toUpperCase(Locale.getDefault());
        System.out.println("Верхний регистр: " + upperCaseString);

        // 8. Преобразовать строку к нижнему регистру.
        String lowerCaseString = input.toLowerCase(Locale.getDefault());
        System.out.println("Нижний регистр: " + lowerCaseString);

        // 9. Вырезать строку "Java" с помощью метода substring.
        String substringJava = input.substring(javaPosition, javaPosition + "Java".length());
        System.out.println("Вырезанная строка: " + substringJava);
    }
}
