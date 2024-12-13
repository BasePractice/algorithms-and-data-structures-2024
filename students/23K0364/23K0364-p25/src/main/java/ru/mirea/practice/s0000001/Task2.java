package ru.mirea.practice.s0000001;

import java.util.regex.Pattern;

public abstract class Task2 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";
        String input1 = "abcdefghijklmnopqrstuv18340";
        String input2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        System.out.println(Pattern.matches(regex, input1)); // true
        System.out.println(Pattern.matches(regex, input2)); // false
    }
}

