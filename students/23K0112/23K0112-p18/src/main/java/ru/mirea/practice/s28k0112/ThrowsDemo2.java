package ru.mirea.practice.s28k0112;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getDetails() {
        try (Scanner scanner = new Scanner(System.in)) {
            String key = null;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Введите ключ: ");
                    key = scanner.nextLine();

                    if (key == null || key.trim().isEmpty()) {
                        throw new NullPointerException("Ключ не может быть пустым или null.");
                    }

                    // Если все в порядке, устанавливаем флаг validInput в true
                    validInput = true;
                    System.out.println("Ключ: " + key);
                } catch (NullPointerException e) {
                    System.out.println("Ошибка: " + e.getMessage());
                    System.out.println("Попробуйте снова.");
                }
            }
        }
    }


    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        demo.getDetails(); // Вызов метода для получения ключа
    }
}
