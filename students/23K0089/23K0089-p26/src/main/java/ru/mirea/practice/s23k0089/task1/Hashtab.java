package ru.mirea.practice.s23k0089.task1;

import java.util.Hashtable;
import java.util.Map;

public class Hashtab<K, V> {
    private final Map<K, V> hashtable;

    public Hashtab() {
        hashtable = new Hashtable<>();
    }

    public void add(K key, V value) {
        hashtable.put(key, value);
    }

    public V lookup(K key) {
        return hashtable.get(key);
    }

    public V delete(K key) {
        return hashtable.remove(key);
    }
}
