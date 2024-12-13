package ru.mirea.practice.s230k754.lab11.task1;

import java.util.LinkedList;

public class HashTab {
    private static class Entry {
        String key;
        String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int size;

    public void hashtabInit(int capacity) {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % table.length);
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
        size++;
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
        Entry toRemove = null;
        for (Entry entry : table[index]) {
            if (entry.key.equals(key)) {
                toRemove = entry;
                break;
            }
        }
        if (toRemove != null) {
            table[index].remove(toRemove);
            size--;
        }
    }

    public int size() {
        return size;
    }
}
