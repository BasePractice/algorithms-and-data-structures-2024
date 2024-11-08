package ru.mirea.practice.s23k0116.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DigitChecker {
    public static void main(String[] args) {
        String text1 = "(1 + 8) - 9 / 4";
        String text2 = "6 / 5 - 2 * 9";

        System.out.println("Текст 1: " + hasNumberWithoutPlus(text1));
        System.out.println("Текст 2: " + hasNumberWithoutPlus(text2));
    }

    public static boolean hasNumberWithoutPlus(String text) {
        // Регулярное выражение для поиска чисел без знака '+'
        String pattern = "\\b\\d+\\b(?!\\s*\\+)";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(text);

        // Проверяем, есть ли совпадения
        return matcher.find();
    }
}
