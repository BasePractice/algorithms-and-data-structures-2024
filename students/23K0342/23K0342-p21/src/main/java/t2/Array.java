package ru.mirea.practice.s0000001.t2;

public class Array<T> {
    private T[] elements;

    public Array(T[] elements) {
        this.elements = elements;
    }

    public T get(int index) {
        if (index >= 0 && index < elements.length) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
    }

    public void set(int index, T element) {
        if (index >= 0 && index < elements.length) {
            elements[index] = element;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.length);
        }
    }

    public int size() {
        return elements.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < elements.length; i++) {
            sb.append(elements[i]);
            if (i < elements.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Array<Integer> intStorage = new Array<>(intArray);
        System.out.println("Integer array: " + intStorage);

        String[] stringArray = {"СТОЛ", "СТУЛ", "ЗОНТ"};
        Array<String> stringStorage = new Array<>(stringArray);
        System.out.println("String array: " + stringStorage);
    }
}
