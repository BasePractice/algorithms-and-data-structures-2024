package ru.mirea.practice.s23k0215.task2;

import java.util.LinkedList;

class HashTable {
    private LinkedList<Entry>[] table;
    private int size;

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        LinkedList<Entry> entries = table[index];

        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        entries.add(new Entry(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> entries = table[index];

        for (Entry entry : entries) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> entries = table[index];

        entries.removeIf(entry -> entry.key.equals(key));
    }

    public void hashtabInit() {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }
}
