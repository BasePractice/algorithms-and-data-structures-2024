package ru.mirea.practice.s23k0140.task2;

public class Main<T> {
    private T[] elements;

    public Main(T[] elements) {
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
        Main<Integer> intStorage = new Main<>(intArray);
        System.out.println("Integer array: " + intStorage);

        String[] stringArray = {"Apple", "Banana", "Cherry"};
        Main<String> stringStorage = new Main<>(stringArray);
        System.out.println("String array: " + stringStorage);
    }
}