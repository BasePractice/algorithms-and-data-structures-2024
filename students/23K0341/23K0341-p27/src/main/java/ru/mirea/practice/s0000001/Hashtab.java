package ru.mirea.practice.s0000001;

import java.rmi.NoSuchObjectException;

/**
 * Задания (выполняются на практическом занятии. В файле
 * hashtab.java реализовать функции для работы со словарем на базе
 * хеш-таблицы: <br>
 * - hashtabHash() <br>
 * - hashtabInit() <br>
 * - hashtabAdd () <br>
 * - hashtabLookup() <br>
 * - hashtabDelete() <br>
 */

public final class Hashtab {
    private Entry[] data = null;
    private int len = -1;

    public static void main(String[] args) throws NoSuchObjectException {
        Hashtab table = new Hashtab();
        table.hashtabInit();

        table.hashtabAdd("hello", "world");

        System.out.println(table.hashtabLookup("hello"));
    }

    static class Entry {
        int hash;
        private Object value;

        public Object getValue() {
            return value;
        }

        protected Entry(int hash, Object value) {
            this.hash = hash;
            this.value = value;
        }
    }

    public int hashtabHash(String val) {
        return val.hashCode();
    }

    public void hashtabInit() {
        data = new Entry[8];
        len = 0;
    }

    public void hashtabAdd(String key, Object value) {
        if (len == -1) {
            throw new RuntimeException("Can't add to uninitialized container!");
        }

        if (len + 1 == data.length) {
            Entry[] newData = new Entry[data.length * 2];
            System.arraycopy(data, 0, newData, 0, len);
            data = newData;
        }

        data[len++] = new Entry(this.hashtabHash(key), value);
    }

    public Object hashtabLookup(String key) throws NoSuchObjectException {
        int hash = hashtabHash(key);

        for (int i = 0; i < len; i++) {
            if (data[i].hash == hash) {
                return data[i].getValue();
            }
        }

        throw new NoSuchObjectException("Key: '" + key + "' not found in the hashtab.");
    }

    public void hashtabDelete(String key) throws NoSuchObjectException {
        int hash = hashtabHash(key);
        boolean found = false;

        for (int i = 0; i < len; i++) {
            if (data[i].hash == hash) {
                found = true;
                len--;
            }

            if (found) {
                data[i] = data[i + 1];
            }
        }

        throw new NoSuchObjectException("Key: '" + key + "' not found in the hashtab.");
    }
}
