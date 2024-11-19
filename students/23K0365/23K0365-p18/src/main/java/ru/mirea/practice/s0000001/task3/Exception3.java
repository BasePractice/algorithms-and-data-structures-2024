package ru.mirea.practice.s0000001.task3;

import java.util.Scanner;

public abstract class Exception3 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("You should enter an integer ");
        } catch (ArithmeticException e) {
            System.out.print("Enter an integer that doesn't equal 0 ");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
