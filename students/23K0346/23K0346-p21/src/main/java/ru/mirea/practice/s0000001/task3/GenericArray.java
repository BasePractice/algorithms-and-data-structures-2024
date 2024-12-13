package ru.mirea.practice.s0000001.task3;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElementByIndex(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + array.length);
        }
        return array[index];
    }

    public int size() {
        return array.length;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericArray = new GenericArray<>(intArray);

        System.out.println("Элемент по индексу 2: " + genericArray.getElementByIndex(2));
    }
}

