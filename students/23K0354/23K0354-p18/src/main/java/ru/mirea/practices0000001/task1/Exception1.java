package ru.mirea.practices0000001.task1;

/**
 * public class Exception1 {
 * public void exceptionDemo() {
 * System.out.println(2 / 0);
 * }
 * <p>
 * public static void main(String[] args) {
 * Exception1 exception1 = new Exception1();
 * exception1.exceptionDemo();
 * }
 * }
 * Класс Exception1 содержит метод exceptionDemo(), который выполняет деление чисел.
 * При попытке деления на ноль возникает исключение ArithmeticException.
 * В первом случае используется целочисленное деление, что приводит к ошибке.
 * ------------------------------
 * public class Exception1 {
 * public void exceptionDemo() {
 * System.out.println(2.0 / 0.0);
 * }
 * <p>
 * public static void main(String[] args) {
 * Exception1 exception1 = new Exception1();
 * exception1.exceptionDemo();
 * }
 * }
 * <p>
 * Во втором случае используются числа с плавающей запятой, что даёт результат Infinity.
 */
public final class Exception1 {

    private Exception1() {

    }

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
/**
 * В методе exceptionDemo() опасная операция деления на ноль помещена в блок try.
 * Если происходит деление на ноль, выбрасывается исключение ArithmeticException,
 * которое перехватывается блоком catch. Вместо завершения программы с ошибкой,
 * выводится сообщение "Попытка деления на ноль".
 */