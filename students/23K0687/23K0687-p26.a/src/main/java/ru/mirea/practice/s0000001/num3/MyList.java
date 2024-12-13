package ru.mirea.practice.s0000001.num3;

import java.util.Arrays;

public class MyList<T> implements Iterable<T> {
    private Object[] data;
    private int size;

    public MyList() {
        data = new Object[10];
        size = 0;
    }

    public void add(T item) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = item;
    }

    public int size() {
        return size;
    }

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(data, size);
    }
}
