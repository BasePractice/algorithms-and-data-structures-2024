package ru.mirea.practice.s23k0145.lab2;

import java.util.Arrays;

public class FlexibleArray<T> {
    private Object[] data;
    private int count;

    public FlexibleArray(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Начальный размер должен быть положительным");
        }
        data = new Object[initialCapacity];
        count = 0;
    }

    public void add(T element) {
        ensureCapacity();
        data[count++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + count);
        }
        return (T) data[index];
    }

    public int size() {
        return count;
    }

    private void ensureCapacity() {
        if (count == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(data, count));
    }

    public static void main(String[] args) {
        FlexibleArray<Object> array = new FlexibleArray<>(5);

        array.add(42);
        array.add(123456789L);
        array.add("Привет");
        array.add(3.1415);

        System.out.println("Содержимое массива: " + array);
        System.out.println("Элемент по индексу 1: " + array.get(1));
        System.out.println("Размер массива: " + array.size());
    }
}
