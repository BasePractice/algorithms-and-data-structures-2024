package ru.mirea.practice.s230k754.lab11;

import org.jetbrains.annotations.NotNull;

import java.util.Locale;

public final class Task1 {
    private Task1() {}

    public static void firstMethod(@NotNull String anyString) {
        System.out.println(anyString.charAt(anyString.length() - 1));
        System.out.println(anyString.endsWith("!!!"));
        System.out.println(anyString.startsWith("I like"));
        System.out.println(anyString.contains("Java"));
        System.out.println(anyString.indexOf("Java"));
        System.out.println(anyString.replace('a', 'o'));
        System.out.println(anyString.toUpperCase(new Locale("en", "EN")));
        System.out.println(anyString.toLowerCase(new Locale("en", "EN")));
        System.out.println(anyString.substring(7));
    }

    public static void main(String[] args) {
        firstMethod("I like Java!!!");
    }
}
