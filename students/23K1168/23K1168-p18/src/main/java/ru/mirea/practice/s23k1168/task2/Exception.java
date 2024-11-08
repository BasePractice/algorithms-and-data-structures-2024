package ru.mirea.practice.s23k1168.task2;

import java.util.Scanner;

public final class Exception {

    private Exception() {

    }

    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter an integer: ");
                String intString = myScanner.next();
                try {
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Input error. Please enter a valid integer.");
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero. Please enter a non-zero integer.");
                }
            }
        }
    }
}