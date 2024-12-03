package ru.mirea.practice.s23k0130.task2;

import java.util.Scanner;

public final class Exception2 {

    private Exception2() {

    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }

    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero is not allowed!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered value is not a valid integer!");
            }
        }
    }
}

