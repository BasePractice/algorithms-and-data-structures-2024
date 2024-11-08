package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public class Exception2 {

    // Метод для демонстрации обработки исключений
    public void exceptionDemo() {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Введите число: "); // Запрос ввода у пользователя
            String intString = myScanner.next();

            try {
                // Пробуем преобразовать строку в целое число
                int i = Integer.parseInt(intString);
                System.out.println(2 / i); // Деление 2 на введенное значение
            } catch (NumberFormatException e) {
                // Обработка исключения для неверного формата (нецелочисленный ввод)
                System.out.println("Введено не целое число");
            } catch (ArithmeticException e) {
                // Обработка исключения для деления на ноль
                System.out.println("Ошибка деления на ноль");
            } catch (Exception e) {
                // Общая обработка других исключений
                System.out.println("Иная ошибка: " + e.getMessage());
            } finally {
                // Этот блок выполнится в любом случае
                System.out.println("Выход из метода");
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Инстанцирование класса Exception2 и вызов метода
        Exception2 exceptionInstance = new Exception2();
        exceptionInstance.exceptionDemo();
    }
}
