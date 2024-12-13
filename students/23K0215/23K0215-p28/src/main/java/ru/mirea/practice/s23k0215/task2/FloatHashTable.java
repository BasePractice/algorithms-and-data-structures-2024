package ru.mirea.practice.s23k0215.task2;

import java.util.LinkedList;

public class FloatHashTable {
    static class Entry {
        double key;
        String value;

        public Entry(double key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    public FloatHashTable(int capacity) {
        table = new LinkedList[capacity];
        size = 0;
    }

    private int hash(double key) {
        long bits = Double.doubleToLongBits(key);
        return (int) (bits ^ (bits >>> 32)) % table.length;
    }

    public void put(double key, String value) {
        int index = hash(key);
        if (table[index] == null) {
            table[index] = new LinkedList<>();
        }

        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        table[index].add(new Entry(key, value));
        size++;
    }

    public String get(double key) {
        int index = hash(key);
        if (table[index] == null) {
            return null;
        }

        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean containsKey(double key) {
        int index = hash(key);
        if (table[index] == null) {
            return false;
        }
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return true;
            }
        }
        return false;
    }

    public void remove(double key) {
        int index = hash(key);
        if (table[index] == null) {
            return;
        }

        table[index].removeIf(entry -> entry.key == key);
    }

    public int size() {
        return size;
    }

    public void printTable() {
        for (LinkedList<Entry> entries : table) {
            if (entries != null) {
                for (Entry entry : entries) {
                    System.out.println("Ключ: " + entry.key + ", Значение: " + entry.value);
                }
            }
        }
    }

    public static void main(String[] args) {
        FloatHashTable hashTable = new FloatHashTable(10);

        hashTable.put(3.14, "Пи");
        hashTable.put(2.71, "Число Эйлера");
        hashTable.put(1.618, "Золотое сечение");

        System.out.println("Значение для ключа 3.14: " + hashTable.get(3.14));
        System.out.println("Значение для ключа 2.71: " + hashTable.get(2.71));

        System.out.println("Содержит ли ключ 1.618: " + hashTable.containsKey(1.618));

        hashTable.remove(2.71);
        System.out.println("Содержит ли ключ 2.71 после удаления: " + hashTable.containsKey(2.71));

        System.out.println("Все записи:");
        hashTable.printTable();
    }
}


