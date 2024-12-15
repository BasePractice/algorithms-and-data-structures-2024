package ru.mirea.practice.s230k754.lab11.task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Task2 {
    private Task2() {}

    public static void main(final String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.nextLine();
            System.out.println(Pattern.matches("abcdefghijklmnopqrstuv18340", input));
        }
    }
}
