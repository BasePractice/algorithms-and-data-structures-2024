package ru.mirea.practice.s23k0155;


import java.util.Locale;

public abstract class Main {
    public static void stringMethod(String string) {
        System.out.println(string.charAt(string.length() - 1));
        boolean lastStr = string.endsWith("!!!");
        System.out.println("Конец строки удлетворяет условию: " + lastStr);
        boolean firstStr = string.startsWith("I like");
        System.out.println("Начало строки удлетворяет условию: " + firstStr);
        boolean containStr = string.contains("Java");
        System.out.println("Строка содержит подстроку:" + containStr);
        int indStartStr = string.indexOf("Java");
        System.out.println("Начальный индекс подстроки: " + indStartStr);
        String resString = string.replace('a','o');
        System.out.println("Строка с изменёнными символами: " + resString);
        String uppedString = string.toUpperCase(Locale.getDefault());
        System.out.println(uppedString);
        String lowerString = string.toLowerCase(Locale.getDefault());
        System.out.println(lowerString);
        String subbedString = string.substring(indStartStr,indStartStr + 4);
        System.out.println(subbedString);
    }

    public static void main(String[] args) {
        stringMethod("I like Java!!!");
    }
}