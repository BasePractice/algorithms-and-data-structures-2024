package ru.mirea.practice.s23k0143;

import java.util.LinkedList;

class HashTable {
    private static class KeyValue {
        String key;
        String value;

        KeyValue(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<KeyValue>[] table;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    public void add(String key, String value) {
        int index = hash(key);
        for (KeyValue kv : table[index]) {
            if (kv.key.equals(key)) {
                kv.value = value; // Обновление существующего значения
                return;
            }
        }
        table[index].add(new KeyValue(key, value)); // Добавление новой пары
    }

    public String lookup(String key) {
        int index = hash(key);
        for (KeyValue kv : table[index]) {
            if (kv.key.equals(key)) {
                return kv.value; // Возвращаем значение
            }
        }
        return null; // Если ключ не найден
    }

    public void delete(String key) {
        int index = hash(key);
        table[index].removeIf(kv -> kv.key.equals(key)); // Удаление элемента
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            if (!table[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (KeyValue kv : table[i]) {
                    System.out.print("[" + kv.key + ": " + kv.value + "] ");
                }
                System.out.println();
            }
        }
    }
}
