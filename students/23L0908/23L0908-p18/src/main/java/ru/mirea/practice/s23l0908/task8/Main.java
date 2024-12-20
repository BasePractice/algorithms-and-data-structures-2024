package ru.mirea.practice.s23l0908.task8;


import java.util.Scanner;

public final class Main {

    private Main() {
    }

    public static void getKey() {
        Scanner scanner = new Scanner(System.in);
        String key = "";
        try {
            System.out.print("Enter key: ");
            key = scanner.nextLine();
            if (key.isEmpty()) {
                throw new ArithmeticException("Key is empty!");
            }
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException.getMessage());
        } finally {
            scanner.close();
        }
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static String getDetails(String key) {
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
