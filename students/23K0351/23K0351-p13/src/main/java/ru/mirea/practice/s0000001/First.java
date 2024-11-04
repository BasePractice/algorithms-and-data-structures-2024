package ru.mirea.practice.s0000001;

import java.util.Locale;

abstract class First {
    public static void main(String[] args) {
        String input = "I like Java!!!";
        performStringOperations(input);
    }

    public static void performStringOperations(String str) {
        // 1. Распечатать последний символ строки
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // 2. Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // 3. Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается на 'I like': " + startsWithILike);

        // 4. Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // 5. Найти позицию подстроки "Java" в строке
        int indexOfJava = str.indexOf("Java");
        System.out.println("Позиция 'Java': " + indexOfJava);

        // 6. Заменить все символы "а" на "о"
        String replacedString = str.replace('а', 'о');
        System.out.println("Строка после замены 'а' на 'о': " + replacedString);

        // 7. Преобразовать строку к верхнему регистру
        String upperCaseString = str.toUpperCase(Locale.ENGLISH);
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 8. Преобразовать строку к нижнему регистру
        String lowerCaseString = str.toLowerCase(Locale.ENGLISH);
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 9. Вырезать строку "Java"
        String substringJava = str.substring(indexOfJava, indexOfJava + "Java".length());
        System.out.println("Вырезанная строка: " + substringJava);
    }
}
