package ru.mirea.practice.task1.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class DictionaryTest {

    private DictionaryTest() {
        throw new UnsupportedOperationException("Этот класс не должен быть экземплярируемым");
    }

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();

        dict.put("apple", "Фрукт.");
        dict.put("banana", "Длинный изогнутый фрукт.");
        dict.put("cat", "Маленькое млекопитающее с шерстью.");
        dict.put("dog", "Млекопитающее, часто содержащиеся как домашний питомец.");
        dict.put("elephant", "Большое млекопитающее с хоботом.");
        dict.put("flower", "Растения.");
        dict.put("guitar", "Музыкальный инструмент с шестью струнами.");
        dict.put("house", "Здание для проживания людей.");
        dict.put("ice", "Замерзшая вода.");
        dict.put("jungle", "Местность, покрытая густым лесом.");

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Поиск элемента по ключу");
                System.out.println("2. Удаление элемента по ключу");
                System.out.println("3. Показать содержимое словаря");
                System.out.println("4. Выход");
                System.out.print("Выберите действие (1-4): ");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Введите ключ для поиска: ");
                        String keySearch = sc.nextLine();
                        if (dict.containsKey(keySearch)) {
                            System.out.println("Элемент найден: " + keySearch + " - " + dict.get(keySearch));
                        } else {
                            System.out.println("Элемент с ключом '" + keySearch + "' не найден.");
                        }
                        break;

                    case 2:
                        System.out.print("Введите ключ для удаления: ");
                        String keyRemove = sc.nextLine();
                        if (dict.containsKey(keyRemove)) {
                            dict.remove(keyRemove);
                            System.out.println("Элемент с ключом '" + keyRemove + "' был удален.");
                        } else {
                            System.out.println("Элемент с ключом '" + keyRemove + "' не найден для удаления.");
                        }
                        break;

                    case 3:
                        System.out.println("\nСодержимое словаря:");
                        for (Map.Entry<String, String> entry : dict.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                        break;

                    case 4:
                        System.out.println("Выход из программы...");
                        return;

                    default:
                        System.out.println("Неверный выбор. Пожалуйста, выберите число от 1 до 4.");
                        break;
                }
            }
        } finally {
            sc.close();
        }
    }
}

