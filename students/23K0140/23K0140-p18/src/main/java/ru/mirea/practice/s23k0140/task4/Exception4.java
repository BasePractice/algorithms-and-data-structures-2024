package ru.mirea.practice.s23k0140.task4;

import java.util.Scanner;

public final class Exception4 {

    private Exception4() {

    }

    public static void main(String[] args) {
        Exception4 exception4 = new Exception4();
        exception4.exceptionDemo();
    }

    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero is not allowed!");
            } catch (NumberFormatException e) {
                System.out.println("Entered value is not a valid integer!");
            } catch (Exception e) {
                System.out.println("An unexpected error has occurred: " + e.getMessage());
            } finally {
                System.out.println("Demo completed.");
                myScanner.close();
            }
        }
    }
}