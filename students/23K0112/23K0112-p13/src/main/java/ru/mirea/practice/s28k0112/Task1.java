package ru.mirea.practice.s28k0112;

import java.util.Locale;

public final class Task1 {
    private Task1() {

    }

    public static void main(String[] args) {
        // Task 1
        String string = "I like Java!!!";

        // Task 2
        System.out.println("Last char: " + string.charAt(string.length() - 1));
        // Task 3
        if (string.endsWith("!!!")) {
            System.out.println("Ends with !!!");
        } else {
            System.out.println("Doesn't ends with !!!");
        }
        // Task 4
        if (string.startsWith("I like")) {
            System.out.println("Starts with 'I like'");
        } else {
            System.out.println("Doesn't starts with 'I like'");
        }

        // Task 5
        if (string.contains("Java")) {
            System.out.println("Contains 'Java'");
        } else {
            System.out.println("Doesn't contains 'Java'");
        }

        // Task 6
        System.out.println("Start index: " + string.indexOf("Java"));

        // Task 7
        System.out.println(string.replace('a', 'o'));

        // Task 8
        System.out.println(string.toUpperCase(Locale.ENGLISH));

        // Task 9
        System.out.println(string.toLowerCase(Locale.ENGLISH));

        // Task 10
        System.out.println(string.substring(7, 11));
    }
}
