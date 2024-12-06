package ru.mirea.practice.s00000027.task23;

import java.util.HashMap;
import java.util.Map;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        Map<Integer, String> dictionary = new HashMap<>();

        dictionary.put(1001, "Алексей, 28");
        dictionary.put(1002, "Мария, 34");
        dictionary.put(1003, "Дмитрий, 22");
        dictionary.put(1004, "Екатерина, 41");
        dictionary.put(1005, "Ирина, 25");
        dictionary.put(1006, "Сергей, 39");
        dictionary.put(1007, "Ольга, 30");
        dictionary.put(1008, "Наталья, 45");
        dictionary.put(1009, "Владимир, 27");
        dictionary.put(1010, "Татьяна, 33");

        System.out.println("Созданный словарь:");
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }

        int keyToSearch = 1005;
        if (dictionary.containsKey(keyToSearch)) {
            System.out.println("\nНайдено значение для ключа " + keyToSearch + ": " + dictionary.get(keyToSearch));
        } else {
            System.out.println("Элемент с ключом " + keyToSearch + " не найден.");
        }

        int keyToDelete = 1003;
        if (dictionary.containsKey(keyToDelete)) {
            dictionary.remove(keyToDelete);
            System.out.println("\nЭлемент с ключом " + keyToDelete + " был удален.");
        } else {
            System.out.println("\nЭлемент с ключом " + keyToDelete + " не найден для удаления.");
        }

        System.out.println("\nОбновленный словарь:");
        for (Map.Entry<Integer, String> entry : dictionary.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
