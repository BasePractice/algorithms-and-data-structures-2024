package ru.mirea.practice.s23k0350;

import java.util.LinkedList;

class HashTab {
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

    public void hashtabInit(int size) {
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
}