package ru.mirea.practice.s0000001;

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
                System.out.println("Ошибка: Введено не целое число.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: Деление на ноль.");
            }
        }
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}
