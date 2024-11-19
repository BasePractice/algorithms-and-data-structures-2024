package ru.mirea.practice.s23k0135.task1;

import java.util.Locale;

public abstract class Task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // 1. Распечатать последний символ
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));

        // 2. Проверить, заканчивается ли строка "!!!"
        System.out.println("Заканчивается ли строка \"!!!\": " + str.endsWith("!!!"));

        // 3. Проверить, начинается ли строка "I like"
        System.out.println("Начинается ли строка \"I like\": " + str.startsWith("I like"));

        // 4. Проверить, содержит ли строка "Java"
        System.out.println("Содержит ли строка \"Java\": " + str.contains("Java"));

        // 5. Найти позицию подстроки "Java"
        System.out.println("Позиция подстроки \"Java\": " + str.indexOf("Java"));

        // 6. Заменить все символы "а" на "о"
        String replacedStr = str.replace('а', 'о');
        System.out.println("Строка с замененными символами: " + replacedStr);

        // 7. Преобразовать строку к верхнему регистру
        System.out.println("Верхний регистр: " + str.toUpperCase(Locale.getDefault()));

        // 8. Преобразовать строку к нижнему регистру
        System.out.println("Нижний регистр: " + str.toLowerCase(Locale.getDefault()));

        // 9. Вырезать строку "Java"
        String javaSubstring = str.substring(str.indexOf("Java"), str.indexOf("Java") + "Java".length());
        System.out.println("Вырезанная строка \"Java\": " + javaSubstring);
    }
}
