package ru.mirea.practice.s23k0093;


import java.util.Locale;

public abstract class StringOperations {

    public static void processString(String input) {
        // Распечатать последний символ строки
        char lastChar = input.charAt(input.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        // Проверить, заканчивается ли строка подстрокой "!!!"
        boolean endsWithExclamation = input.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamation);

        // Проверить, начинается ли строка подстрокой "I like"
        boolean startsWithILike = input.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        // Проверить, содержит ли строка подстроку "Java"
        boolean containsJava = input.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        // Найти позицию подстроки "Java"
        int positionOfJava = input.indexOf("Java");
        System.out.println("Позиция 'Java': " + positionOfJava);

        // Заменить все символы "а" на "о"
        String replacedString = input.replace("a", "o");
        System.out.println("Заменённая строка (a -> o): " + replacedString);

        // Преобразовать строку к верхнему регистру
        String upperCaseString = input.toUpperCase(Locale.ENGLISH);
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // Преобразовать строку к нижнему регистру
        String lowerCaseString = input.toLowerCase(Locale.ENGLISH);
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // Вырезать строку "Java"
        int startIndex = input.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        String substringJava = input.substring(startIndex, endIndex);
        System.out.println("Вырезанная подстрока 'Java': " + substringJava);
    }

    public static void main(String[] args) {
        String input = "I like Java!!!";
        processString(input);
    }
}
