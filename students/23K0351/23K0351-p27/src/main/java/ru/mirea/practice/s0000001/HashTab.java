package ru.mirea.practice.s0000001;

import java.util.LinkedList;

class HashTab {
    private LinkedList<Entry>[] table;
    private int size;


    private class Entry {
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


    public void display() {
        for (int i = 0; i < size; i++) {
            if (!table[i].isEmpty()) {
                for (Entry entry : table[i]) {
                    System.out.println("Ключ: " + entry.key + ", Значение: " + entry.value);
                }
            }
        }
    }
}
