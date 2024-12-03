package ru.mirea.practice.s23k0755.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String testStr1 = "abcdefghijklmnopqrstuv18340";
        String testStr2 = "abcdefghijklmnoasdfasdpqrstuv18340";

        Matcher m1 = pattern.matcher(testStr1);
        System.out.println(m1.find());
        Matcher m2 = pattern.matcher(testStr2);
        System.out.println(m2.find());
    }
}
