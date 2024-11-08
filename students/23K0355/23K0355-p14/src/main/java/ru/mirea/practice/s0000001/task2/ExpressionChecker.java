package ru.mirea.practice.s0000001.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ExpressionChecker {

    private ExpressionChecker() {
        throw new UnsupportedOperationException("Невозможно создать экземпляр утилитарного класса.");
    }

    public static boolean containsNumberWithoutPlus(String text) {
        String regex = "\\d+(?!\\s*\\+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }

    public static void main(String[] args) {
        String expression1 = "(1 + 8) – 9 / 4";
        String expression2 = "6 / 5 – 2 * 9";

        System.out.println("Expression 1 is valid: " + !containsNumberWithoutPlus(expression1));
        System.out.println("Expression 2 is valid: " + !containsNumberWithoutPlus(expression2));
    }
}
