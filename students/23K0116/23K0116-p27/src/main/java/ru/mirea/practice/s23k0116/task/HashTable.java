package ru.mirea.practice.s23k0116.task;

import java.util.HashMap;
import java.util.Map;

public class HashTable {
    private Map<Integer, String> hashtable;

    // Инициализация хеш-таблицы
    public void hashtabInit() {
        hashtable = new HashMap<>();
    }

    // Хеширование ключа (в данном случае используется встроенный хеш)
    public int hashtabHash(String key) {
        return key.hashCode();
    }

    // Добавление элемента в хеш-таблицу
    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        hashtable.put(hash, value);
    }

    // Поиск элемента по ключу
    public String hashtabLookup(String key) {
        int hash = hashtabHash(key);
        return hashtable.get(hash);
    }

    // Удаление элемента по ключу
    public void hashtabDelete(String key) {
        int hash = hashtabHash(key);
        hashtable.remove(hash);
    }

    // Вывод всех элементов таблицы
    public void printHashTable() {
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key Hash: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
