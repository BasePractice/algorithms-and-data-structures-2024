package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

class ThrowsDemo {
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter a key: ");
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private String getDetails(String key) {
        if (key.isEmpty()) {
            throw new RuntimeException("Key set to empty string");
        }
        return "Data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
