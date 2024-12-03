package ru.mirea.practice.s23k0135.task2;

import java.util.Scanner;

public final class Exception2 {

    private Exception2() {

    }

    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter an integer: ");
                String intString = myScanner.next();
                try {
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Input error. Please enter a valid integer.");
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero. Please enter a non-zero integer.");
                }
            }
        }
    }
}

// БЕЗ Try-Catch!
// "Qwerty": Программа выдает исключение NumberFormatException, потому что "Qwerty" не является допустимым числовым представлением.
// "0": Программа выдает исключение ArithmeticException, потому что деление на 0 является недопустимой операцией.
// "1.2": Программа выдает исключение NumberFormatException, потому что 1.2 не является допустимым целым числом.

// С Try-Catch!
// Блоки try-catch обрабатывают возможные исключения: NumberFormatException (неправильный ввод) и ArithmeticException (деление на ноль).
// При вводе недопустимого значения (например, "Qwerty" или 1.2) программа не завершается с ошибкой,
// Она выводит сообщение об исключении NumberFormatException.
// При вводе "0" программа не завершается с ошибкой,
// Она выводит сообщение об исключении ArithmeticException.
