package ru.mirea.practice.s00000025.task2;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public final class RegexTest {

    private RegexTest() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {

        String validString = "abcdefghijklmnopqrstuv18340";
        String invalidString = "abcdefghijklmnoasdfasdpqrstuv18340";

        String regex = "^abcdefghijklmnopqrstuv18340$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcherValid = pattern.matcher(validString);
        if (matcherValid.matches()) {
            System.out.println("Строка '" + validString + "' является правильной.");
        } else {
            System.out.println("Строка '" + validString + "' является неправильной.");
        }

        Matcher matcherInvalid = pattern.matcher(invalidString);
        if (matcherInvalid.matches()) {
            System.out.println("Строка '" + invalidString + "' является правильной.");
        } else {
            System.out.println("Строка '" + invalidString + "' является неправильной.");
        }
    }
}
