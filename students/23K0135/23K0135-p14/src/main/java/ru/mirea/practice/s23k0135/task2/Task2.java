package ru.mirea.practice.s23k0135.task2;

import java.util.regex.Pattern;

public abstract class Task2 {

    public static void main(String[] args) {
        String regex = "abcdefghijklmnopqrstuv18340";

        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340.";

        System.out.println(input1 + ": " + Pattern.matches(regex, input1));
        System.out.println(input2 + ": " + Pattern.matches(regex, input2));
    }
}

