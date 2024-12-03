package ru.mirea.practice.s0000001.n1;

import java.util.Locale;

public final class StringProc {

    private StringProc() {}

    public static void main(String[] args) {
        String str = "I like Java!!!";
        // 1
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ: " + lastChar);
        // 2
        boolean endsWithExcl = str.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExcl);
        // 3
        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);
        // 4
        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);
        // 5
        int javaPos = str.indexOf("Java");
        System.out.println("Позиция 'Java': " + javaPos);
        // 6
        String replacedStr = str.replace('a', 'o');
        System.out.println("Замена 'a' на 'o': " + replacedStr);
        // 7
        String upperStr = str.toUpperCase(Locale.ROOT);
        System.out.println("В верхнем регистре: " + upperStr);
        // 8
        String lowerStr = str.toLowerCase(Locale.ROOT);
        System.out.println("В нижнем регистре: " + lowerStr);
        // 9
        String subStr = str.substring(javaPos, javaPos + 4);
        System.out.println("Подстрока 'Java': " + subStr);
    }
}
