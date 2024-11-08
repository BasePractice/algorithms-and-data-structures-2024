package ru.mirea.practice.s0000001;

import java.util.Locale;

public final class MainTask {
    private MainTask() {
        // Приватный конструктор для предотвращения создания экземпляров
    }

    public static void main(String[] args) {
        String message = "I like Java!!!"; // Исходная строка

        // Задание 2: Последний символ
        char lastCharacter = message.charAt(message.length() - 1);
        System.out.println("Последний символ: " + lastCharacter);

        // Задание 3: Проверка на окончание строки
        if (message.endsWith("!!!")) {
            System.out.println("Строка заканчивается на !!!");
        } else {
            System.out.println("Строка не заканчивается на !!!");
        }

        // Задание 4: Проверка на начало строки
        if (message.startsWith("I like")) {
            System.out.println("Строка начинается с 'I like'");
        } else {
            System.out.println("Строка не начинается с 'I like'");
        }

        // Задание 5: Проверка на наличие подстроки
        boolean containsJava = message.contains("Java");
        System.out.println(containsJava ? "Содержит 'Java'" : "Не содержит 'Java'");

        // Задание 6: Индекс подстроки
        int startIndex = message.indexOf("Java");
        System.out.println("Индекс 'Java': " + startIndex);

        // Задание 7: Замена символов
        String replacedMessage = message.replace('a', 'o');
        System.out.println(replacedMessage);

        // Задание 8: Преобразование в верхний регистр
        String upperCaseMessage = message.toUpperCase(Locale.ENGLISH);
        System.out.println(upperCaseMessage);

        // Задание 9: Преобразование в нижний регистр
        String lowerCaseMessage = message.toLowerCase(Locale.ENGLISH);
        System.out.println(lowerCaseMessage);

        // Задание 10: Извлечение подстроки
        String substring = message.substring(7, 11);
        System.out.println(substring);
    }
}