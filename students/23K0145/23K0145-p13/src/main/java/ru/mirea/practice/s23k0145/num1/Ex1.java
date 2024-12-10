package ru.mirea.practice.s23k0145.num1;

import java.util.Locale;

public final class Ex1 {

    private Ex1() {

    }

    public static void main(String[] args) {
        String input = "I like Java!!!";
        printLastCharacter(input);
        endsWithMarks(input);
        startsWithILike(input);
        containsJava(input);
        findSubstringPosition(input);
        System.out.println(replaceAWithO(input));
        System.out.println(convertToUpperCase(input));
        System.out.println(convertToLowerCase(input));
        System.out.println(cutOutSubstring(input));
    }

    public static void printLastCharacter(String str) {
        if (str != null && str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            System.out.println("Строка пуста или null.");
        }
    }

    public static void endsWithMarks(String str) {
        if (str.endsWith("!!!")) {
            System.out.println("Строка заканчивается на \"!!!\"");
        } else {
            System.out.println("Строка не заканчивается на \"!!!\"");
        }
    }

    public static void startsWithILike(String str) {
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с \"I like!\"");
        } else {
            System.out.println("Строка не начинается с \"I like!\"");
        }
    }

    public static void containsJava(String str) {
        if (str.contains("Java")) {
            System.out.println("Строка содержит \"Java\"");
        } else {
            System.out.println("Строка не содержит \"Java\"");
        }
    }

    public static void findSubstringPosition(String str) {
        if (str.indexOf("Java") != -1) {
            System.out.println("Подстрока \"Java\" найдена на позиции: " + str.indexOf("Java"));
        } else {
            System.out.println("Подстрока \"Java\" не найдена.");
        }
    }

    public static String replaceAWithO(String str) {
        return str.replace('a', 'o');
    }

    public static String convertToUpperCase(String str) {
        return str.toUpperCase(Locale.US);
    }

    public static String convertToLowerCase(String str) {
        return str.toLowerCase(Locale.US);
    }

    public static String cutOutSubstring(String str) {
        int startIndex = str.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        return str.substring(startIndex, endIndex);
    }
}
