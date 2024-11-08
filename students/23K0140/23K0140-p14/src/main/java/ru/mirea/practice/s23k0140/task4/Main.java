package ru.mirea.practice.s23k0140.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String correctText = "(1 + 8) – 9 / 4";
        String incorrectText = "6 / 5 – 2 * 9";

        String regex = "(?<!\\+)\\d";

        boolean isCorrectValid = containsDigitsWithoutPlus(correctText, regex);
        System.out.println("Корректный текст содержит цифры без '+': " + isCorrectValid);

        boolean isIncorrectValid = containsDigitsWithoutPlus(incorrectText, regex);
        System.out.println("Некорректный текст содержит цифры без '+': " + isIncorrectValid);
    }

    public static boolean containsDigitsWithoutPlus(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}