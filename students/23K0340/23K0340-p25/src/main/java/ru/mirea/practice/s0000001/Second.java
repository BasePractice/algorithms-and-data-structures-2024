package ru.mirea.practice.s0000001;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public abstract class Second {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String regex1 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d_]+$";
            Pattern p1 = Pattern.compile(regex1);
            Matcher m1 = p1.matcher(sc.nextLine());
            System.out.println(m1.matches());
        }
    }
}
