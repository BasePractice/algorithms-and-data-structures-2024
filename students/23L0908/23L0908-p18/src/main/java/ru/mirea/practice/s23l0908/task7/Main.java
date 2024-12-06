package ru.mirea.practice.s23l0908.task7;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = myScanner.next();
            printDetails(key);
        }
    }

    public static void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private static String getDetails(String key) {
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
