package ru.mirea.practice.s0000001;

import java.nio.BufferOverflowException;

/**
 * Написать класс, который умеет хранить в себе массив любых
 * типов данных (int, long etc.).
 */

public abstract class Task2 {

    static class Storage {
        int length = 0;
        boolean dynamic;
        private Object[] data;

        private void resize() {
            Object[] nData = new Object[data.length * 2];
            System.arraycopy(data, 0, nData, 0, data.length);
            data = nData;
        }

        public void add(Object el) {
            if (length + 1 >= data.length) {
                if (dynamic) {
                    resize();
                } else {
                    throw new BufferOverflowException();
                }
            }

            data[length++] = el;
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder("Data [");
            for (int i = 0; i < length; i++) {
                str.append(" ").append(i).append(": ").append(data[i]);
                if (i + 1 < length) {
                    str.append(",");
                }
            }
            str.append(" ]");

            return str.toString();
        }

        Storage(int len) {
            this(len, false);
        }

        Storage(int len, boolean dynamic) {
            data = new Object[len];
            this.dynamic = dynamic;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Storage cont = new Storage(20);

        for (int i = 0; i < n; i++) {
            cont.add(i);
            cont.add(1.757 * i);
            cont.add("Hello there no." + i + 5);
        }

        System.out.println(cont);
    }
}
