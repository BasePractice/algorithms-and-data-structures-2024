package ru.mirea.practice.s0000001;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Not an Integer");
            } finally {
                System.out.println("end");
            }
        }
    }
}
