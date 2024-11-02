package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public final class PatternMatching {
    private PatternMatching() {

    }

    private static final String REGEX = "abcdefghijklmnopqrstuv18340";
    private static final Pattern pattern = Pattern.compile(REGEX);

    public static boolean isValidString(String input) {
        return pattern.matcher(input).matches();
    }

    public static void main(String[] args) {
        String[] testStrings = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnoasdfasdpqrstuv18340"};
        for (String test : testStrings) {
            System.out.println(test + " " + isValidString(test));
        }
    }
}