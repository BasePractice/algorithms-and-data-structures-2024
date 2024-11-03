package ru.mirea.practice.s23k0143;

import java.util.Scanner;

public class ThrowsDemo {

    // Метод для ввода ключа
    public void getKey() {
        try (Scanner myScanner = new Scanner(System.in)) {
            String key = null;

            // Используем цикл, чтобы предоставить пользователю возможность повторного ввода
            while (true) {
                System.out.print("Введите ключ: ");
                key = myScanner.next();

                // Добавляем блок try-catch для обработки возможных исключений
                try {
                    // Если пользователь вводит 'exit', выходим из цикла
                    if ("exit".equalsIgnoreCase(key)) {
                        System.out.println("Выход из программы");
                        break;
                    }
                    printDetails(key); // Передача ключа в метод для обработки
                    break; // Выйти из цикла, если ввод успешен
                } catch (NullPointerException e) {
                    // Обработка исключения, если ключ равен null
                    System.out.println("Ошибка ключа: " + e.getMessage());
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    // Метод для вывода деталей с обработкой исключений
    public void printDetails(String key) {
        // В данном случае 'key' не может быть null,
        // но демонстрируем, как это обрабатывается в этом методе
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Ошибка в printDetails: " + e.getMessage());
        }
    }

    // Основной метод для получения деталей по ключу
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("пустой ключ в getDetails"); // Генерация исключения
        }
        return "Ключ -  " + key; // Возврат сообщения
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey(); // Ввод ключа и обработка
    }
}
