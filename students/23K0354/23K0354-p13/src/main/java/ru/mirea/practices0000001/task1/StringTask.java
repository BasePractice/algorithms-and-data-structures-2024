package ru.mirea.practices0000001.task1;

import java.util.Locale;

public abstract class StringTask {

    public static void main(String[] args) {
        String str = "I like Java!!!";

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка на '!!!': " + endsWithExclamation);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается ли строка с 'I like': " + startsWithILike);

        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + containsJava);

        int indexOfJava = str.indexOf("Java");
        System.out.println("Позиция 'Java': " + indexOfJava);

        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка с заменой 'a' на 'o': " + replacedStr);

        String upperCaseStr = str.toUpperCase(Locale.ROOT);
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase(Locale.ROOT);
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        String substringJava = str.substring(indexOfJava, indexOfJava + "Java".length());
        System.out.println("Вырезанная строка 'Java': " + substringJava);
    }
}