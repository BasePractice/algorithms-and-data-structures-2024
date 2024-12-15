package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public abstract class Task4 {
    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4";
        String text2 = "6 / 5 – 2 * 9";
        String regex = "\\b\\d+(?!\\s*\\+)";

        System.out.println("Text 1 contains numbers without +: " + Pattern.compile(regex).matcher(text1).find());
        System.out.println("Text 2 contains numbers without +: " + Pattern.compile(regex).matcher(text2).find());
    }
}
