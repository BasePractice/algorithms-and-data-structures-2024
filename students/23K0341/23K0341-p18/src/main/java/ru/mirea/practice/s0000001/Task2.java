package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * Шаг 1.Измените код в листинге 18.3 на следующий:
 * Листинг 18.4 Пример программы
 * public class Exception2 {
 * public void exceptionDemo() {
 * Scanner myScanner = new Scanner( System.in);
 * System.out.print( "Enter an integer ");
 * String intString = myScanner.next();
 * int i = Integer.parseInt(intString);
 * System.out.println( 2/i );
 * }
 * }
 * Шаг 2. Запустите эту программу со следующими выводами: Qwerty 0 1.2 1. Посмотрите на вывод.
 * Объясните какие исключения выбрасываются?
 * Шаг 3. Измените код, добавив блоки try – catch, чтобы иметь дело с определяемыми исключениями.
 * Объясните поведение программы
 */

public abstract class Task2 {
    public static void main(String[] args) {
        // exceptionDemo(); // step 2

        // step 3
        try {
            exceptionDemo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
    }

    /*
     * Шаг 1: Done
     *
     * Шаг 2:
     *   - Input: Qwerty
     *     Output:
     *     Error: Exception in thread "main" java.lang.NumberFormatException: For input string: "Qwerty"
     *
     *   - Input: 0
     *     Output:
     *     Error: Exception in thread "main" java.lang.ArithmeticException: / by zero
     *
     *   - Input: 1.2
     *     Output:
     *     Error: Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
     *
     *   - Input: 1
     *     Output: 2
     *     Error:
     *
     * Шаг 3: Программа продолжает работать, несмотря на обнаружение ошибки пользовательского ввода.
     *        Сообщение об ошибке отображается без остановки программы.
     */
}
