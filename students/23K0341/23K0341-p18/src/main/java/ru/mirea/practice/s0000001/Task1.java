package ru.mirea.practice.s0000001;

/**
 * Шаг 1. Выполните следующую программу и посмотрите, что происходит:
 * Листинг 18.2 Пример обработки деления на ноль
 * public class Exception1 {
 * public void exceptionDemo() {
 * System.out.println( 2 / 0 );
 * }
 * }
 * Описание работы
 * Вам необходимо инстанцировать класс и выполнить exceptionDemo(). Что произойдет?
 * Ответ: программа даст сбой, и вы получите следующее сообщение
 * java.lang.ArithmeticException: / by zero at Exception1.exceptionDemo(Exception1.java:12)
 * Это говорит нам о том, что программа пытается выполнить деление на ноль, который он не в состоянии выполнить.
 * Объясните поведение программы.
 * Шаг 2. Измените программу следующим образом.
 * Замените 2/0 на 2,0 / 0,0 и повторно вызовите метод. Что произойдет?
 * Теперь измените код в классе Exception1 и включите блок try-catch следующим образом:
 * Листинг 18.3 Пример обработки исключения
 * public class Exception1 {
 * public void exceptionDemo() {
 * try{
 * System.out.println( 2/0 );
 * } catch ( ArithmeticException e ) { System.out.println("Attempted division by zero");
 * }
 * }
 * }
 * Шаг 3. Запустите программу и обратите внимание на новое поведение.
 * Объясните поведение программы.
 * Note: I WON'T BOTHER MAKING THIS BEAUTIFUL.
 */

public abstract class Task1 {
    public static void main(String[] args) {
        // exceptionDemo1(); // Step 1
        exceptionDemo2(); // Step 2

        // Step 3
        try {
            exceptionDemo1();
        } catch (Exception e) {
            System.out.println("Attempted division by zero");
        }
        try {
            exceptionDemo2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public static void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }

    /*
     * Шаг 1: Ответ совпал; <br>
     * Шаг 2: Получим ответ Infinity согласно стандарту IEEE 754: https://en.wikipedia.org/wiki/IEEE_754
     * Шаг 3: Выведется сообщение: Попытка деления на 0; Что говорит, что ошибка не прервёт раоту программы.
     */
}
