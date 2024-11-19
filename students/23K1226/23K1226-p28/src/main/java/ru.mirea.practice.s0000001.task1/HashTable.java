package ru.mirea.practice.s0000001.task1;

class HashTable {
    private static final int SIZE = 10;
    private Entry[] table;

    public HashTable() {
        table = new Entry[SIZE];
    }

    private static class Entry {
        double key;
        String value;
        Entry next;

        Entry(double key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public int hash(double key) {
        return (int) (key % SIZE);
    }

    public void add(double key, String value) {
        int index = hash(key);
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

    public String lookup(double key) {
        int index = hash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void delete(double key) {
        int index = hash(key);
        Entry current = table[index];
        Entry previous = null;
        while (current != null) {
            if (current.key == key) {
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
