package ru.mirea.practice.s23l0908.task2;

import java.util.LinkedList;

public class Hashtab {
    private static final int TABLE_SIZE = 128;
    private LinkedList<Entry>[] table;

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Функция хеширования (hashtabHash)
    private int hashtabHash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash = (31 * hash + c) % TABLE_SIZE; // Простая хеш-функция
        }
        return hash;
    }

    // Инициализация таблицы (hashtabInit)
    @SuppressWarnings("unchecked")
    public void hashtabInit() {
        table = new LinkedList[TABLE_SIZE]; // Предупреждение здесь
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Добавление элемента в таблицу (hashtabAdd)
    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Обновление значения, если ключ уже существует
                return;
            }
        }
        table[hash].add(new Entry(key, value)); // Добавление новой записи
    }

    // Поиск элемента по ключу (hashtabLookup)
    public String hashtabLookup(String key) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int hash = hashtabHash(key);
        table[hash].removeIf(entry -> entry.key.equals(key)); // Удаление записи
    }

    // Тестирование работы хеш-таблицы
    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab();
        hashtab.hashtabInit();

        // Добавление данных
        hashtab.hashtabAdd("key1", "value1");
        hashtab.hashtabAdd("key2", "value2");
        hashtab.hashtabAdd("key3", "value3");

        // Поиск
        System.out.println("key1: " + hashtab.hashtabLookup("key1")); // Ожидается value1
        System.out.println("key4: " + hashtab.hashtabLookup("key4")); // Ожидается null

        // Удаление
        hashtab.hashtabDelete("key2");
        System.out.println("key2 после удаления: " + hashtab.hashtabLookup("key2")); // Ожидается null
    }
}
