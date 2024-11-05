package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class Exception3 {
    private Exception3() {

    }

    public static void exceptionDemo() {
        Scanner myScanner = null;
        try {
            myScanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();

            try {
                int i = Integer.parseInt(intString);
                System.out.println(2 / i);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введено не целое число.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль.");
            }
        } finally {
            if (myScanner != null) {
                myScanner.close();
                System.out.println("Ресурсы освобождены.");
            }
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
