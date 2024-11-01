package ru.mirea.practice.s0000001.task2;

import java.util.Locale;

public final class StringUtils {

    private StringUtils() {
        // Запрет на создание экземпляров класса
    }

    public static void processString(String input) {
        // 1. Распечатать последний символ строки
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 2. Проверка на окончание подстрокой "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // 3. Проверка на начало подстрокой "I like"
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        // 4. Проверка на наличие подстроки "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // 5. Позиция подстроки "Java"
        int javaPosition = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPosition);

        // 6. Замена всех символов "a" на "o"
        String replacedString = input.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedString);

        // 7. Преобразование строки к верхнему регистру
        String upperCaseString = input.toUpperCase(Locale.ROOT);
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 8. Преобразование строки к нижнему регистру
        String lowerCaseString = input.toLowerCase(Locale.ROOT);
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 9. Вырезание подстроки "Java"
        if (containsJava) {
            int startIndex = javaPosition;
            int endIndex = startIndex + "Java".length();
            String substring = input.substring(startIndex, endIndex);
            System.out.println("Вырезанная подстрока 'Java': " + substring);
        } else {
            System.out.println("Подстрока 'Java' не найдена для вырезания.");
        }
    }

    public static void main(String[] args) {
        String inputString = "I like Java!!!";
        processString(inputString);
    }
}