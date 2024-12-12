package ru.mirea.practice.s23k0164.t1;

import java.util.regex.Pattern;

public final class StringCheck {
    private StringCheck() {

    }

    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String correctString = "abcdefghijklmnopqrstuv18340";
        String incorrectString = "abcdefghijklmnoasdfasdpqrstuv18340";

        boolean isCorrect = Pattern.matches(regex, correctString);
        System.out.println("Is correct string valid? " + isCorrect);

        boolean isIncorrect = Pattern.matches(regex, incorrectString);
        System.out.println("Is incorrect string valid? " + isIncorrect);
    }
}
