package ru.mirea.practice.s0000001;

import java.util.LinkedList;

public class HashTable {
    private static final int TABLE_SIZE = 256;
    private final LinkedList<Entry>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        hashtabInit();
    }

    private static class Entry {
        final String key;
        final String value;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int hashtabHash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash = (hash * 31 + c) % TABLE_SIZE;
        }
        return hash;
    }

    private void hashtabInit() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void hashtabAdd(String key, String value) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                throw new IllegalArgumentException("Key already exists: " + key);
            }
        }
        table[hash].add(new Entry(key, value));
    }

    public String hashtabLookup(String key) {
        int hash = hashtabHash(key);
        for (Entry entry : table[hash]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int hash = hashtabHash(key);
        table[hash].removeIf(entry -> entry.key.equals(key));
    }

    public static void main(String[] args) {
        HashTable hashtable = new HashTable();
        hashtable.hashtabAdd("one", "1");
        hashtable.hashtabAdd("two", "2");
        hashtable.hashtabAdd("three", "3");

        System.out.println("Lookup 'two': " + hashtable.hashtabLookup("two"));
        hashtable.hashtabDelete("two");
        System.out.println("Lookup 'two' after deletion: " + hashtable.hashtabLookup("two"));
    }
}
