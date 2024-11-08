package ru.mirea.practice.s23k0130.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d \\+ \\d");
        String testStr1 = "(1 + 8) – 9 / 4";
        String testStr2 = "6 / 5 – 2 * 9";

        Matcher matcher = pattern.matcher(testStr1);
        System.out.println(matcher.find());
        matcher = pattern.matcher(testStr2);
        System.out.println(matcher.find());
    }
}
