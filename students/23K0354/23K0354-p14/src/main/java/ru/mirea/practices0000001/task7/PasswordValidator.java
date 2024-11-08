package ru.mirea.practices0000001.task7;

import java.util.regex.Pattern;
import java.util.Scanner;

public abstract class PasswordValidator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.nextLine();
            Pattern p1 = Pattern.compile("[A-Z]");
            Pattern p2 = Pattern.compile("[a-z]");
            Pattern p3 = Pattern.compile("[1-9]");
            Pattern p4 = Pattern.compile("{8}+");
            if (p1.matcher(s1).find()) {
                if (p2.matcher(s1).find()) {
                    if (p3.matcher(s1).find()) {
                        if (p4.matcher(s1).find()) {
                            System.out.println("password : " + s1 + " is acceptable");
                        } else {
                            System.out.println("password must have at least 8 symbols");
                        }
                    } else {
                        System.out.println("password must have at least 1 number");
                    }
                } else {
                    System.out.println("password must have at least 1 lowercase letter");
                }
            } else {
                System.out.println("password must have at least 1 capital letter");
            }
        }
    }
}
