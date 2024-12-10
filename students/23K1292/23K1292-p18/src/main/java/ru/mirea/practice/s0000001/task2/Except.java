package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class Except {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: "); // Added a space for better readability
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                if (i == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println(2 / i);
                }
            } catch (NumberFormatException e1) {
                try {
                    double i1 = Double.parseDouble(intString);
                    System.out.println("Input is a double");
                    System.out.println(2 / i1);
                } catch (NumberFormatException e2) {
                    System.out.println("Input is a letter");
                }
            }
        }
    }

    public static void main(String[] args) {
        Except exceptionDemo = new Except();
        exceptionDemo.exceptionDemo();
    }
}
