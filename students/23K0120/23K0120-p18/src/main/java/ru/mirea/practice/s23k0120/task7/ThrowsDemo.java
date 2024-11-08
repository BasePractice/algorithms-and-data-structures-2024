package ru.mirea.practice.s23k0120.task7;

import java.util.Scanner;

public class ThrowsDemo {

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printDetails("a"); // data for a
        demo.printDetails(null); // null key in getDetails
    }

    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = myScanner.next();
            printDetails(key);
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    public String getDetails(String key) {
        if (key.isEmpty()) {
            throw new NullPointerException("Key set to empty string");
        }
        return "data for " + key;
    }
}
