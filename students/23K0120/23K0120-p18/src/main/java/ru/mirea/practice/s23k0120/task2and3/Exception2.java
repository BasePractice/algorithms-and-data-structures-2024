package ru.mirea.practice.s23k0120.task2and3;

import java.util.Scanner;

public abstract class Exception2 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
    }

    public static void main(String[] args) {
        exceptionDemo();

        // Qwerty : Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
        // 0 : Exception in thread "main" java.lang.ArithmeticException: / by zero
        // 1.2 : Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
        // 1 : 2
    }
}
