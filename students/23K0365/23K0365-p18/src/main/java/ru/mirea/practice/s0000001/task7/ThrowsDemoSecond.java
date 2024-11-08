package ru.mirea.practice.s0000001.task7;

import java.util.Scanner;

public abstract class ThrowsDemoSecond {
    public static void getKey() throws Exception {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = myScanner.next();
            printDetails(key);
        }
    }

    public static void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        ThrowsDemoSecond.getKey();
    }
}
