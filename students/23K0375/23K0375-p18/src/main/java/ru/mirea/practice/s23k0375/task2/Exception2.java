package ru.mirea.practice.s23k0375.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(4 / i);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: not an integer");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        } catch (InputMismatchException e) {
            System.out.println("Input mismatch");
        } finally {
            myScanner.close();
        }
    }
}
