package ru.mirea.practice.s23k0755.task2;

public class GenericArray<T> {
    private T[] elements;

    public GenericArray(T[] elements) {
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
        GenericArray<Integer> intStorage = new GenericArray<>(intArray);
        System.out.println("Integer array: " + intStorage);

        String[] stringArray = {"Петя", "Вася", "Федя"};
        GenericArray<String> stringStorage = new GenericArray<>(stringArray);
        System.out.println("String array: " + stringStorage);
    }
}

