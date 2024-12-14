package ru.mirea.practice.s23k0087;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("([a-zA-Z.\\d])+@(([a-z]+\\.[a-z]+)|[a-z]+)");
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }
        if (pattern.matcher(input).matches()) {
            System.out.println("Input string is a valid email address");
        } else {
            System.out.println("Input string is not a valid email address");
        }
    }
}
