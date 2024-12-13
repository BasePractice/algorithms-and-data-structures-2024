package ru.mirea.practice.s230k754.lab11.task4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Task4 {
    private Task4() {}

    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile("\\d+(!\\+|$)");
            Matcher matcher = pattern.matcher(input);
            System.out.println(matcher.find());
        }
    }
}
