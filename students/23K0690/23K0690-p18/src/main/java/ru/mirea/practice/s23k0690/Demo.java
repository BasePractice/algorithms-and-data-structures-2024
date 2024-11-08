package ru.mirea.practice.s23k0690;

import java.util.Scanner;

public class Demo {
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
    }
}
