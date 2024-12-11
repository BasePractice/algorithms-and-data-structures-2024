package ru.mirea.practice.s23k0823.task1.task1.task2;

import java.util.Arrays;

public class GenericArray<E> {
    private Object[] elements;
    private int size;

    public GenericArray() {
        elements = new Object[10];
        size = 0;
    }

    public void add(E element) {
        if (size >= elements.length) {
            resize();
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    public int size() {
        return size;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    public static void main(String[] args) {
        GenericArray<Object> genericArray = new GenericArray<>();

        genericArray.add(10);         // int
        genericArray.add(20L);        // long
        genericArray.add("Hello");    // String
        genericArray.add(3.14);       // double

        System.out.println("Массив: " + genericArray);
        System.out.println("Элемент по индексу 2: " + genericArray.get(2));
        System.out.println("Размер массива: " + genericArray.size());
    }
}

