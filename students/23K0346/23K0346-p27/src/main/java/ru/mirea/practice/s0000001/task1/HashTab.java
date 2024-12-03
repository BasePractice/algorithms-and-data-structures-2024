package ru.mirea.practice.s0000001.task1;

import java.util.LinkedList;

public class HashTab {
    private static final int SIZE = 10;
    private LinkedList<Entry>[] table;

    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public void hashtabInit() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry(key, value));
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        table[index].removeIf(entry -> entry.key.equals(key));
    }

    public void printTable() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Index " + i + ": ");
            for (Entry entry : table[i]) {
                System.out.print("[" + entry.key + " -> " + entry.value + "] ");
            }
            System.out.println();
        }
    }
}

