package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in);) {
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }  catch (Exception e) {
            System.out.println("Error");
        }
    }

    private String getDetails(String key) throws Exception {
        if ("".equals(key)) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}
