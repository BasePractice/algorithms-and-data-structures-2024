package ru.mirea.practice.s23k0143;

public class Exception1 {

    // Метод, который демонстрирует деление на ноль
    public void exceptionDemo() {
        try {
            // Здесь происходит попытка деления на ноль
            System.out.println(2 / 0); // Эта строка вызовет исключение
        } catch (ArithmeticException e) {
            // Обработка исключения, если оно происходит
            System.out.println("Ошибка деления на ноль"); // Сообщение об ошибке
        }
    }

    public static void main(String[] args) {
        // Инстанцирование класса Exception1
        Exception1 exceptionInstance = new Exception1();

        // Вызов метода exceptionDemo()
        exceptionInstance.exceptionDemo(); // Комментарий: Программа попытается выполнить деление на ноль
    }
}
