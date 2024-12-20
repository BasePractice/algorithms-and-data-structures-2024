package ru.mirea.practice.s0000001.num2;

import java.util.HashMap;
import java.util.Map;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();

        dict.put("key1", "value1");
        dict.put("key2", "value2");
        dict.put("key3", "value3");
        dict.put("key4", "value4");

        String searchKey = "key2";
        if (dict.containsKey(searchKey)) {
            System.out.println("Найдено значение для ключа " + searchKey + ": " + dict.get(searchKey));
        } else {
            System.out.println("Ключ " + searchKey + " не найден.");
        }

        String removeKey = "key3";
        if (dict.containsKey(removeKey)) {
            dict.remove(removeKey);
            System.out.println("Ключ " + removeKey + " был удален.");
        } else {
            System.out.println("Ключ " + removeKey + " не найден для удаления.");
        }

        System.out.println("Обновленный словарь:");
        for (Map.Entry<String, String> entry : dict.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
        }
    }
}
