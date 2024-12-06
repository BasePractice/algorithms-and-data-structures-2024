package ru.mirea.practice.s23l0908.task6;

import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (Exception e) {
            System.out.println("key is null!");
            return;
        }
        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter key: ");
            String key = scanner.nextLine();
            printMessage(key);
        }
    }
}
