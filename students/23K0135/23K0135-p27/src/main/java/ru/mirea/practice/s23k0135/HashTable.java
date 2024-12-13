package ru.mirea.practice.s23k0135;

import java.util.LinkedList;

public class HashTable {

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int TABLE_SIZE = 16;
    private LinkedList<Entry>[] table;

    public void hashtabInit() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % TABLE_SIZE);
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }

        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        LinkedList<Entry> bucket = table[index];

        bucket.removeIf(entry -> entry.key.equals(key));
    }

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
