package ru.mirea.practice.s0000001.n4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить запрещено :(");
        } finally {
            System.out.println("Завершение работы");
        }
    }
}
