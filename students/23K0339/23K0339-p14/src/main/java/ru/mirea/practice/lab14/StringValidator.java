package ru.mirea.practice.lab14;

import java.util.regex.Pattern;

public abstract class StringValidator {
    public static boolean isValidString(String input) {
        return Pattern.matches("^abcdefghijklmnopqrstuv18340$", input);
    }

    public static void main(String[] args) {
        System.out.println(isValidString("abcdefghijklmnopqrstuv18340"));
        System.out.println(isValidString("abcdefghijklmnoasdfasdpqrstuv18340"));
    }
}
