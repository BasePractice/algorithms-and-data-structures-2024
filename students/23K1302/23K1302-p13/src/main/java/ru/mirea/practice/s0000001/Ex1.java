package ru.mirea.practice.s0000001;

import java.util.Locale;

public final class Ex1 {

    private Ex1() {
        // 123
    }

    public static void main(String[] args) {

        String str = "I like Java!!!";

        System.out.println("1.  Исходная строка: " + str);

        System.out.println("2.  Последний символ: " + str.charAt(str.length() - 1));

        System.out.println("3.  Заканчивается на '!!!': " + str.endsWith("!!!"));

        System.out.println("4.  Начинается с 'I like': " + str.startsWith("I like"));

        System.out.println("5.  Содержит 'Java': " + str.contains("Java"));

        System.out.println("6.  Позиция 'Java': " + str.indexOf("Java"));

        String replacedStr = str.replace('a', 'o');
        System.out.println("7.  Замена 'a' на 'o': " + replacedStr);

        System.out.println("8.  В верхнем регистре: " + str.toUpperCase(Locale.ROOT));

        System.out.println("9.  В нижнем регистре: " + str.toLowerCase(Locale.ROOT));

        String substringStr = str.substring(0, str.indexOf("Java")) + str.substring(str.indexOf("Java") + 4, str.length() - 1);
        System.out.println("10. Вырезанная подстрока 'Java': " + substringStr);
    }
}
