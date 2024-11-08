package ru.mirea.practice.s23k0116.task;

/**
 * public class Exception2 {
 * public void exceptionDemo() {
 * try (Scanner myScanner = new Scanner(System.in)) {
 * System.out.print("Enter an integer ");
 * String intString = myScanner.next();
 * int i = Integer.parseInt(intString);
 * System.out.println(2 / i);
 * }
 * }
 * <p>
 * public static void main(String[] args) {
 * Exception2 exception2 = new Exception2();
 * exception2.exceptionDemo();
 * }
 * }
 * <p>
 * Qwerty: Здесь программа выбросит NumberFormatException, потому что строка "Qwerty" не может быть преобразована в целое число.
 * 0: Это вызовет ArithmeticException, так как деление на ноль недопустимо.
 * 1.2: Программа опять выбросит NumberFormatException, так как "1.2" не является целым числом.
 * 1: Программа выведет 2.
 */

import java.util.Scanner;

public final class Exception2 {

    private Exception2() {

    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }

    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Division by zero is not allowed!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entered value is not a valid integer!");
            }
        }
    }
}
/**
 * С добавлением try-catch блоков, программа теперь может обрабатывать исключения,
 * выводя осмысленные сообщения вместо прекращения работы. NumberFormatException будет пойман,
 * если входное значение не может быть преобразовано в целое. ArithmeticException будет
 * пойман при попытке деления на ноль.
 */
