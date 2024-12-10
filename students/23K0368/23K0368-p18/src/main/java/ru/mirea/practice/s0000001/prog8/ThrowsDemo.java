package ru.mirea.practice.s0000001.prog8;

import java.util.Scanner;


public class ThrowsDemo {
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a key: ");
                String key = myScanner.nextLine();
                try {
                    printDetails(key);
                    break;
                } catch (Exception e) {
                    System.out.println("Exception caught in getKey: " + e.getMessage());
                }
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) { // Изменено условие для проверки пустой строки
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
