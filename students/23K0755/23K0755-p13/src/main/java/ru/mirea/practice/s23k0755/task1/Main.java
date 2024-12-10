package ru.mirea.practice.s23k0755.task1;

import java.util.Locale;

public abstract class Main {
    public static Locale ru_Ru = new Locale("ru", "Ru");

    public static void stringMethod(String s) {
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.lastIndexOf("Java"));
        String s1 = s.replace("a", "o");
        System.out.println(s1);
        String s2 = s1.toUpperCase(ru_Ru);
        System.out.println(s2);
        String s3 = s2.toLowerCase(ru_Ru);
        System.out.println(s3);
        String s4 = s.substring(s.lastIndexOf("Java"), s.indexOf("!"));
        System.out.println(s4);
    }

    public static void main(String[] args) {
        stringMethod("I like Java!!!");
    }
}
