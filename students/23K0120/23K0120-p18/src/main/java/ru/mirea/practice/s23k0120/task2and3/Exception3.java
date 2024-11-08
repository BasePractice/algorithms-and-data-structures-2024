package ru.mirea.practice.s23k0120.task2and3;

import java.util.Scanner;

public abstract class Exception3 {
    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i;
            try {
                i = Integer.parseInt(intString);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Введённое значение не является целым числом", e);
            }
            try {
                System.out.println(2 / i);
            } catch (ArithmeticException e) {
                throw new RuntimeException("Деление на ноль", e);
            }
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
        // Qwerty : Exception in thread "main" java.lang.RuntimeException: Введённое значение не является целым числом
        // 0 : Exception in thread "main" java.lang.RuntimeException: Деление на ноль
        // 1.2 : Exception in thread "main" java.lang.RuntimeException: Введённое значение не является целым числом
        // 1 : 2
    }
}
