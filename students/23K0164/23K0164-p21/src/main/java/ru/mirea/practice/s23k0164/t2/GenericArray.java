package ru.mirea.practice.s23k0164.t2;

import java.util.ArrayList;
import java.util.List;

public class GenericArray<T> {
    private List<T> elements;

    public GenericArray() {
        elements = new ArrayList<>();
    }

    public void add(T element) {
        elements.add(element);
    }

    public T get(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.size());
        }
        return elements.get(index);
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }

}
