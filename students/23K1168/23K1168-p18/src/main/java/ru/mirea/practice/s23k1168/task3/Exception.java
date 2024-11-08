package ru.mirea.practice.s23k1168.task3;

import java.util.Scanner;

public final class Exception {

    private Exception() {

    }

    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.exceptionDemo();
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
            }
        }
    }
}