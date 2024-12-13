package ru.mirea.practice.s23k0350;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

abstract class PlusFinder {
    public static void main(String[] args) {
        String text = "6 / 5 – 2 * 9";
        String regex = "\\b\\d+\\b(?!\\s*\\+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("В тексте найдены цифры без знака '+'.");
        } else {
            System.out.println("В тексте нет цифр без знака '+'.");
        }
    }
}

