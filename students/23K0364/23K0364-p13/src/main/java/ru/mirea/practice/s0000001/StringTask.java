package ru.mirea.practice.s0000001;

import java.util.Locale;

public abstract class StringTask {

    public static void processString(String str) {
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
        System.out.println("Заканчивается ли строка '!!!': " + str.endsWith("!!!"));
        System.out.println("Начинается ли строка с 'I like': " + str.startsWith("I like"));
        System.out.println("Содержит ли строка 'Java': " + str.contains("Java"));
        System.out.println("Позиция подстроки 'Java': " + str.indexOf("Java"));
        System.out.println("Строка после замены 'a' на 'o': " + str.replace("a", "o"));
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase(Locale.getDefault()));
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase(Locale.getDefault()));
        System.out.println("Вырезанная строка 'Java': " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }

    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}


