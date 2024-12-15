package ru.mirea.practice.s23l0908.task2;

import java.util.LinkedList;

public class Hashtable {
    private static final int tablesize = 10;
    private LinkedList<Hashnode>[] table;

    // Инициализация хеш-таблицы
    public void hashtabInit() {
        table = new LinkedList[tablesize];
        for (int i = 0; i < tablesize; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Хеш-функция
    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % tablesize);
    }

    // Добавление элемента
    public void hashtabAdd(String key, int value) {
        int hashIndex = hashtabHash(key);
        for (Hashnode node : table[hashIndex]) {
            if (node.key.equals(key)) {
                node.value = value; // Обновление значения, если ключ уже существует
                return;
            }
        }
        table[hashIndex].add(new Hashnode(key, value));
    }

    // Поиск элемента по ключу
    public Integer hashtabLookup(String key) {
        int hashIndex = hashtabHash(key);
        for (Hashnode node : table[hashIndex]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // Элемент не найден
    }

    // Удаление элемента по ключу
    public boolean hashtabDelete(String key) {
        int hashIndex = hashtabHash(key);
        for (Hashnode node : table[hashIndex]) {
            if (node.key.equals(key)) {
                table[hashIndex].remove(node);
                return true;
            }
        }
        return false;
    }

    public void printHashTable() {
        for (int i = 0; i < tablesize; i++) {
            System.out.print("Index " + i + ": ");
            for (Hashnode node : table[i]) {
                System.out.print("[" + node.key + ": " + node.value + "] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.hashtabInit();

        // Добавление 10 элементов
        ht.hashtabAdd("Key1", 10);
        ht.hashtabAdd("Key2", 20);
        ht.hashtabAdd("Key3", 30);
        ht.hashtabAdd("Key4", 40);
        ht.hashtabAdd("Key5", 50);
        ht.hashtabAdd("Key6", 60);
        ht.hashtabAdd("Key7", 70);
        ht.hashtabAdd("Key8", 80);
        ht.hashtabAdd("Key9", 90);
        ht.hashtabAdd("Key10", 100);

        System.out.println("Хеш-таблица после добавления элементов:");
        ht.printHashTable();

        String searchKey = "Key5";
        Integer value = ht.hashtabLookup(searchKey);
        System.out.println("\nЗначение для ключа " + searchKey + ": " + value);
        String deleteKey = "Key3";
        boolean isDeleted = ht.hashtabDelete(deleteKey);
        System.out.println("\nУдаление ключа " + deleteKey + ": " + (isDeleted ? "успешно" : "не найден"));

        System.out.println("\nХеш-таблица после удаления элемента:");
        ht.printHashTable();
    }
}
