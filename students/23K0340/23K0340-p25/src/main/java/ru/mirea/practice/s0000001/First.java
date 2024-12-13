package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public abstract class First {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String regex = "\\w+@\\w+\\.\\w+";
            Pattern p1 = Pattern.compile(regex);
            Matcher m1 = p1.matcher(sc.nextLine());
            System.out.println(m1.matches());
        }
    }
}
