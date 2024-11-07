package ru.mirea.practice.s0000001.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e1) {
                try {
                    double i1 = Double.parseDouble(intString);
                    System.out.println("input is a double");
                    System.out.println(2 / i1);
                } catch (Exception e2) {
                    System.out.println("input is a letter");
                }
            }
        }
        // if i is a letter :
        // Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        //at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        //at java.base/java.lang.Integer.parseInt(Integer.java:588)
        //at java.base/java.lang.Integer.parseInt(Integer.java:685)
        //at ru.mirea.task18.task2.Exception2.exceptionDemo(Exception2.java:10)
        //at ru.mirea.task18.task2.Test.main(Test.java:6)
        //if i is a float :
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "1.0"
        //at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        //at java.base/java.lang.Integer.parseInt(Integer.java:588)
        //at java.base/java.lang.Integer.parseInt(Integer.java:685)
        //at ru.mirea.task18.task2.Exception2.exceptionDemo(Exception2.java:10)
        //at ru.mirea.task18.task2.Test.main(Test.java:6)

    }
}
