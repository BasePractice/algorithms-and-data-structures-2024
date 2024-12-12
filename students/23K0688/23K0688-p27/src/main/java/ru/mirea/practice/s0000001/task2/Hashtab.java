package ru.mirea.practice.s0000001.task2;

import java.util.LinkedList;

public class Hashtab {
    private static class Entry {
        String key;
        String el;

        Entry(String key, String el) {
            this.key = key;
            this.el = el;
        }
    }

    private LinkedList<Entry>[] tab;
    private int size;

    public void hashtabInit(int size) {
        tab = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            tab[i] = new LinkedList<>();
        }
        this.size = 0;
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode()) % tab.length;
    }

    public void hashtabAdd(String key, String el) {
        int i = hashtabHash(key);
        for (Entry entry : tab[i]) {
            if (entry.key.equals(key)) {
                entry.el = el;
                return;
            }
        }
        tab[i].add(new Entry(key, el));
        size++;
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        for (Entry entry : tab[index]) {
            if (entry.key.equals(key)) {
                return entry.el;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int i = hashtabHash(key);
        Entry el1 = null;
        for (Entry entry : tab[i]) {
            if (entry.key.equals(key)) {
                el1 = entry;
                break;
            }
        }
        if (el1 != null) {
            tab[i].remove(el1);
            size -= 1;
        }
    }
}
