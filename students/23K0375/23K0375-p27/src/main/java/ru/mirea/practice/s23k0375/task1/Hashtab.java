package ru.mirea.practice.s23k0375.task1;

import java.util.LinkedList;

public class Hashtab {
    private static final int SIZE = 10;
    private LinkedList<Entry>[] table;

    static class Entry {
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

    public int hashtabHash(String key) {
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

    public static void main(String[] args) {
        Hashtab hashtab = new Hashtab();
        hashtab.hashtabInit();

        for (int i = 1; i <= 10; i++) {
            hashtab.hashtabAdd("Key" + i, "Value" + i);
        }

        System.out.println("Поиск Key5: " + hashtab.hashtabLookup("Key5"));
        System.out.println("Поиск Key10: " + hashtab.hashtabLookup("Key10"));

        hashtab.hashtabDelete("Key5");
        System.out.println("Поиск Key5 после удаления: " + hashtab.hashtabLookup("Key5"));

        hashtab.hashtabAdd("Key10", "UpdatedValue10");
        System.out.println("Обновленное значение Key10: " + hashtab.hashtabLookup("Key10"));
    }
}
