package ru.mirea.practice.s23f0011.task1;

import java.util.Locale;

public abstract class Stringmanipulation {
    public static void processString(String input) {
        // 1. Распечатать последний символ строки
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 2. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // 3. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        // 4. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // 5. Найти позицию подстроки "Java"
        int javaPosition = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPosition);

        // 6. Заменить все символы "а" на "о"
        String replacedString = input.replace('a', 'o');
        System.out.println("Строка после замены 'а' на 'о': " + replacedString);

        // 7. Преобразовать строку к верхнему регистру
        String upperCaseString = input.toUpperCase(Locale.ENGLISH);
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 8. Преобразовать строку к нижнему регистру
        String lowerCaseString = input.toLowerCase(Locale.ENGLISH);
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 9. Вырезать подстроку "Java" из строки
        int start = javaPosition; // Начальная позиция подстроки "Java"
        int end = start + "Java".length(); // Конечная позиция
        String substringJava = input.substring(start, end);
        System.out.println("Вырезанная подстрока: " + substringJava);
    }
}
