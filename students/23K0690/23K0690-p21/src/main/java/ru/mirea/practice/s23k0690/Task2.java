package ru.mirea.practice.s23k0690;

import java.util.Arrays;

public class Task2<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public Task2(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size >= array.length) {
            resize();
        }
        array[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Вне диапазона: " + index);
        }
        return array[index];
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size));
    }

    public static void main(String[] args) {
        Task2<Integer> intArray = new Task2<>(5);
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        System.out.println("Integer массив: " + intArray);

        Task2<String> stringArray = new Task2<>(5);
        stringArray.add("Hello");
        stringArray.add("Сигарета!");
        System.out.println("String массив: " + stringArray);

        Task2<Double> doubleArray = new Task2<>(5);
        doubleArray.add(1.1);
        doubleArray.add(2.2);
        System.out.println("Double массив: " + doubleArray);
    }
}
