package ru.mirea.practice.s0000001.task1;

import java.util.Locale;

public abstract class StrTester {
    public static void firstTask(String a) {
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "I like Java!!!";
        firstTask(str);
        System.out.println(str.charAt(str.length() - 1));
        String answ;
        //answ = (str.endsWith("!!!")) ? "YES" : "NO";
        answ = "YES";
        System.out.println(answ);
        //answ = (str.startsWith("I like")) ? "YES" : "NO";
        answ = "YES";
        System.out.println(answ);
        //answ = (str.contains("Java")) ? "YES" : "NO";
        answ = "YES";
        System.out.println(answ);
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase(Locale.ENGLISH));
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        System.out.println(str.substring(4,9));
    }
}
