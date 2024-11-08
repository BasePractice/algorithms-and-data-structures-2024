package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class ExceptionDemo {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.exceptionDemo();
    }
}
