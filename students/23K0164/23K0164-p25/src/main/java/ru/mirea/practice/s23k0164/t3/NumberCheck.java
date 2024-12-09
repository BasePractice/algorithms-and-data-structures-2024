package ru.mirea.practice.s23k0164.t3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public final class NumberCheck {

    private NumberCheck() {

    }

    private static final String regex = "\\d(?!\\s*\\+)";

    public static void main(String[] args) {
        String text1 = "(1 + 8) – 9 / 4.";
        String text2 = "6 / 5 – 2 * 9.";

        checkNumbers(text1);
        checkNumbers(text2);
    }

    private static void checkNumbers(String text) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("В тексте \"" + text + "\" есть цифры, за которыми не стоит знак «+».");
        } else {
            System.out.println("В тексте \"" + text + "\" все цифры стоят за знаком «+» или цифр нет.");
        }
    }
}
