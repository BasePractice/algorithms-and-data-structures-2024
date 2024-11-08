package ru.mirea.practice.s23k0120.task4;

import java.util.Scanner;

public class Exception {
    public void exceptionDemo() {
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
            } finally {
                System.out.println("Конец программы");
            }
        }
    }

    public static void main(String[] args) {
        Exception exception = new Exception();
        exception.exceptionDemo();
        // Qwerty : Exception in thread "main" java.lang.RuntimeException: Введённое значение не является целым числом
        // 0 : Exception in thread "main" java.lang.RuntimeException: Деление на ноль
        // 1.2 : Exception in thread "main" java.lang.RuntimeException: Введённое значение не является целым числом
        // 1 : 2
    }
}
