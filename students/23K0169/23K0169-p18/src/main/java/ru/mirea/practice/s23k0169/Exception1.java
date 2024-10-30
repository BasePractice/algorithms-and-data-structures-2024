package ru.mirea.practice.s23k0169;

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
 * При выполнении метода exceptionDemo() происходит попытка выполнить операцию
 * целочисленного деления 2 / 0. В Java деление целого числа на ноль недопустимо и
 * приводит к выбросу исключения типа ArithmeticException. Поэтому программа выдает
 * следующую ошибку и аварийно завершает работу:
 * java.lang. ArithmeticException: / by zero
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
 * Здесь мы используем числа с плавающей запятой (double). В Java арифметические
 * операции с числами с плавающей запятой следуют стандарту IEEE 754. Согласно этому
 * стандарту, деление положительного числа на положительный ноль возвращает положительную
 * бесконечность. Поэтому вместо выброса исключения программа выводит Infinity.
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
 * Обернули опасную операцию в блок try. Когда происходит попытка деления на ноль,
 * выбрасывается ArithmeticException, которое перехватывается в блоке catch. Вместо
 * аварийного завершения программа обрабатывает исключение и выводит информативное сообщение.
 */