package ru.mirea.practice.s0000001.task2;

import java.util.regex.Pattern;

public abstract class ExactSame {
    public static void main(String[] args) {
        String[] texts = {
            "abcdefghijklmnopqrstuv18340",
            "abcdefghijklmnopqrstqwrfuv18340",
            "abcdefg8340",
            "abcdefghijklmnopqrstuv18340abcdefghijklmnopqrstuv18340"};
        String regex = "abcdefghijklmnopqrstuv18340{1}";

        String corect = "";
        String wrong = "";
        for (String x : texts) {
            if (Pattern.matches(regex, x)) {
                corect += x + "\t";
            } else {
                wrong += x + "\t";
            }
        }
        System.out.println(corect + "\n\n" + wrong);
    }
}
