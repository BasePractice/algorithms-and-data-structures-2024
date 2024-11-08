package ru.mirea.practice.s0000001.task8;

import java.util.Scanner;

public abstract class ThrowsDemo {
    public static void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = null;
            boolean flag = false;
            while (!flag) {
                try {
                    System.out.print("Enter key: ");
                    key = myScanner.next();//""
                    printDetails(key);
                    flag = true;
                } catch (Exception e) {
                    System.out.println("ERORR! " + e.getMessage());
                }
            }
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

    public static void main(String[] args) {
        ThrowsDemo.getKey();
    }
}
