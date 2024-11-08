package ru.mirea.practice.s23k0130.task3;

import java.util.Scanner;

public final class Exception3 {

    private Exception3() {

    }

    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        exception3.exceptionDemo();
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
            }
        }
    }
}