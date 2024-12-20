package ru.mirea.practice.s23l0908.task1;

import java.util.Locale;

public final class Main {

    private Main() {
    }

    public static String func(String str) {
        return str;
    }

    public static void main(String[] args) {
        //1.
        String s = "I like Java!!!";
        System.out.println(func(s));
        //2.
        String st = "The weather is cold";
        System.out.println(st.charAt(st.length() - 1));
        //3.

        if (s.endsWith("!!!")) {
            System.out.println("The Strings end with \"!!!\"");
        }
        //4.
        if (s.startsWith("I like")) {
            System.out.println("The Strings start with\"I like\"");
        }
        //5.
        if (s.contains("Java")) {
            System.out.println("The Strings containing \"Java\"");
        }
        //6.
        System.out.println(s.indexOf("Java"));
        //7.
        System.out.println(s.replace('a', 'o'));
        //8.
        System.out.println(s.toUpperCase(Locale.ROOT));
        //9.
        System.out.println(s.toLowerCase(Locale.ROOT));
        //10.
        String str = s.substring(7);
        System.out.println(str);
    }
}
