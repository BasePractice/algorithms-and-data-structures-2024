package ru.mirea.practice.s23k0120.task5;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {
    public static void main(String[] args) {
        Pattern patternAll = Pattern.compile("[a-zA-Z\\d_]+");
        Pattern patternDigit = Pattern.compile("\\d");
        Pattern patternUpper = Pattern.compile("[A-Z]");
        Pattern patternLower = Pattern.compile("[a-z]");
        String input;
        try (Scanner scanner = new Scanner(System.in)) {
            input = scanner.nextLine();
        }
        if (!patternAll.matcher(input).matches()
            || !patternDigit.matcher(input).find()
            || !patternUpper.matcher(input).find()
            || !patternLower.matcher(input).find()) {
            System.out.println("Input string is not a secure password");
        } else {
            System.out.println("Input string is a secure password");
        }
    }
}
