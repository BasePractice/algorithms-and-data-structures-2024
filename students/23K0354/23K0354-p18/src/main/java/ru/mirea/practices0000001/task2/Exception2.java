package ru.mirea.practices0000001.task2;

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
 * Класс Exception2 содержит метод exceptionDemo(), который запрашивает у пользователя
 * целое число и выполняет деление на это число. Если пользователь вводит некорректное
 * значение, программа обрабатывает соответствующие исключения.
 */

import java.util.Scanner;

public final class Exception2 {

    private Exception2() {
        // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }

    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Введите целое число: ");
            String intString = myScanner.next();
            try {
                int i = Integer.parseInt(intString);
                try {
                    System.out.println(2 / i);
                } catch (ArithmeticException e) {
                    System.out.println("Деление на ноль недопустимо!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Введенное значение не является целым числом!");
            }
        }
    }
}
/**
 * С добавлением блоков try-catch, программа теперь может обрабатывать исключения,
 * выводя соответствующие сообщения вместо прекращения работы. NumberFormatException
 * будет поймано, если входное значение не может быть преобразовано в целое число.
 * ArithmeticException будет поймано при попытке деления на ноль.
 */
