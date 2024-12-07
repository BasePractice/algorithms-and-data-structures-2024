package ru.mirea.practice.s0000001;

public class Ex2<T> {
    private final T[] array;

    @SuppressWarnings("unchecked")
    public Ex2(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public static void main(String[] args) {
        Ex2<Integer> intArray = new Ex2<>(5);
        intArray.set(0, 42);
        intArray.set(1, 100);

        System.out.println("Value at index 0: " + intArray.get(0));
        System.out.println("Value at index 1: " + intArray.get(1));

        Ex2<String> stringArray = new Ex2<>(3);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");

        System.out.println("Value at index 0: " + stringArray.get(0));
        System.out.println("Value at index 1: " + stringArray.get(1));
    }
}
