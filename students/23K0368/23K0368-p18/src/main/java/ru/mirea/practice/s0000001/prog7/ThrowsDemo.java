package ru.mirea.practice.s0000001.prog7;

import java.util.Scanner;


public class ThrowsDemo {
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter a key: ");
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Exception caught in getKey: " + e.getMessage());
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Exception caught in printDetails: " + e.getMessage());
            throw e; // Повторный выброс исключения
        }
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
