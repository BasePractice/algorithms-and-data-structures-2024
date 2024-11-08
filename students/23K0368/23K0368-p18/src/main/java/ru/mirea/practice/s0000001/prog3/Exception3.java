package ru.mirea.practice.s0000001.prog3;

import java.util.Scanner;

public abstract class Exception3 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic exception division by zero");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[]args) {
        exceptionDemo();
    }
}


