package ru.mirea.practice.s0000001.task1;

class HashTable {
    private static final int SIZE = 10;
    private Entry[] table;

    public HashTable() {
        table = new Entry[SIZE];
    }

    private static class Entry {
        String key;
        String value;
        Entry next;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hashtabHash(String key) {
        return key.hashCode() % SIZE;
    }

    public void hashtabInit() {
        for (int i = 0; i < SIZE; i++) {
            table[i] = null;
        }
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        Entry newEntry = new Entry(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEntry;
        }
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Entry current = table[index];
        Entry previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }
}
