package ru.mirea.practice.s23f0011.task4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid integer input. Please enter an integer.");
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } finally {
                System.out.println("This block always executes, regardless of exceptions.");
            }
        }
    }
}
/*
-  Независимо  от  того,  возникло  исключение  или  нет,  блок  finally  всегда  выполняется.
-  В  конце  выполнения  метода  exceptionDemo()  всегда  будет  выведено  сообщение  "This block always executes, regardless of exceptions."
 */

