package ru.mirea.practice.s0000001.prog4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        String text = "(1 + 8) – 9 / 4 и 6 / 5 – 2 * 9";

        Pattern pattern = Pattern.compile("\\b\\d+\\b(?!\\s*\\+)");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Числа, за которыми не стоит знак '+':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
