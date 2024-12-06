package ru.mirea.practice.s23l0908.task123;

import java.util.Scanner;

public final class Demo {

    private Demo() {
    }

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (Exception e) {
                System.out.println("Not int!");
            }
        }
    }
}
