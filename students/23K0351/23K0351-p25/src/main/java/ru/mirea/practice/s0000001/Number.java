package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract  class Number {
    public static void main(String[] args) {
        String text = "1 + 8 – 9 / 4";
        boolean hasInvalidNumbers = checkForInvalidNumbers(text);
        System.out.println("Есть ли цифры без знака '+': " + hasInvalidNumbers);
    }

    public static boolean checkForInvalidNumbers(String text) {
        Pattern pattern = Pattern.compile("\\b\\d+\\b(?!\\s*\\+)");
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}
