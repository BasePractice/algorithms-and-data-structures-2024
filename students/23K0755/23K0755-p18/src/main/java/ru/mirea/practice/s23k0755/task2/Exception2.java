package ru.mirea.practice.s23k0755.task2;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = null;

        try {
            myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid integer.");
            } catch (ArithmeticException e) {
                System.out.println("Attempted division by zero.");
            }
        } finally {
            if (myScanner != null) {
                myScanner.close();
            }
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}


//При вводе "Qwerty":
//Программа выведет: Input is not a valid integer. вместо того, чтобы завершиться с ошибкой.
//При вводе "0":
//Программа выведет: Attempted division by zero. вместо того, чтобы завершиться с ошибкой.
//При вводе "1.2":
//Программа также выведет: Input is not a valid integer. вместо того, чтобы завершиться с ошибкой.

