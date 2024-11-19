package ru.mirea.practice.lab18.ex2;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key;
            while (true) {
                System.out.print("Enter key: ");
                key = myScanner.next();

                try {
                    printDetails(key);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid key, please try again.");
                }
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}


