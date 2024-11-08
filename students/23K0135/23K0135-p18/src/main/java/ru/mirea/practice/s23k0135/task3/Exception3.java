package ru.mirea.practice.s23k0135.task3;

import java.util.Scanner;

public final class Exception3 { // Class is now final

    private Exception3() {
    } // Private constructor to prevent instantiation

    public static void exceptionDemo() { // Method is now static
        try (Scanner myScanner = new Scanner(System.in)) { // Using try-with-resources
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero");
            }
        }
    }

    public static void main(String[] args) {
        exceptionDemo(); // Calling static method directly
    }
}

// "Qwerty": Выводится: Invalid input: For input string: "Qwerty"
// "0": Выводится: Attempted division by zero
// "1.2": Выводится: Invalid input: For input string: "1.2"
