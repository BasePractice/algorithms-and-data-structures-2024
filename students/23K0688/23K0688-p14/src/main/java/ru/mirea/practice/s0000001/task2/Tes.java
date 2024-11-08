package ru.mirea.practice.s0000001.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Tes {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        String s1 = "abcdefghijklmnopqrstuv18340";
        Matcher m1 = p1.matcher(s1);
        String s2 = "abcdefghijklmnopqrstuv183401";
        Matcher m2 = p1.matcher(s2);
        String s3 = "aabcdefghijklmnopqrstuv18340";
        Matcher m3 = p1.matcher(s3);
        System.out.println("s1 == s1? - " + m1.matches());
        System.out.println("s1 == s2? - " + m2.matches());
        System.out.println("s1 == s33? - " + m3.matches());
    }
}
