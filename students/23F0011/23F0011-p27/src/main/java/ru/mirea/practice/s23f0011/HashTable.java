package ru.mirea.practice.s23f0011;

import java.util.LinkedList;

public class HashTable {

    // Класс для хранения записи (пары ключ-значение)
    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int TABLE_SIZE = 16;  // Размер хэш-таблицы
    private LinkedList<Entry>[] table;  // Массив для хранения корзин (списков)

    // Инициализация хэш-таблицы
    public void hashtabInit() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();  // Инициализация каждой корзины
        }
    }

    // Хэш-функция, которая вычисляет индекс корзины
    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % TABLE_SIZE);  // Используем встроенную хэш-функцию
    }

    // Добавление элемента в хэш-таблицу
    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);  // Вычисление индекса корзины
        LinkedList<Entry> bucket = table[index];

        // Проверка, существует ли уже такой ключ
        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;  // Обновление значения, если ключ найден
                return;
            }
        }

        // Если ключа нет, добавляем новую запись
        bucket.add(new Entry(key, value));
    }

    // Поиск элемента по ключу
    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;  // Возвращаем значение, если ключ найден
            }
        }

        return null;  // Если ключ не найден, возвращаем null
    }

    // Удаление элемента по ключу
    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        bucket.removeIf(entry -> entry.key.equals(key));  // Удаление записи по ключу
    }

    // Печать хэш-таблицы для тестирования
    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }
}
