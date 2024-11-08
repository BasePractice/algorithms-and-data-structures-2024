package ru.mirea.practice.s0000001;

import java.util.Locale;

public abstract class First {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        System.out.println(s.charAt(s.length() - 1));
        if (s.endsWith("!!!")) {
            System.out.println("t");
        } else {
            System.out.println("f");
        }
        if (s.startsWith("I like")) {
            System.out.println("t");
        } else {
            System.out.println("f");
        }
        if (s.contains("Java")) {
            System.out.println("t");
        } else {
            System.out.println("f");
        }
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a','o'));
        System.out.println(s.toUpperCase(Locale.ENGLISH));
        System.out.println(s.toLowerCase(Locale.ENGLISH));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("Java") + 4));
    }
}
