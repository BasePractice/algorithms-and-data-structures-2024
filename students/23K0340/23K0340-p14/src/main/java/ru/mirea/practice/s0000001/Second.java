package ru.mirea.practice.s0000001;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
            Matcher m1 = p1.matcher(sc.nextLine());
            System.out.println(m1.matches());
        }
    }
}
