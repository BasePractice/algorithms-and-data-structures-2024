package ru.mirea.practice.s00000021;

public class ArrayStorage<T> {
    private T[] items;

    public ArrayStorage(T[] items) {
        this.items = items;
    }

    public T getItemByIndex(int index) {
        if (index < 0 || index >= items.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return items[index];
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40};
        ArrayStorage<Integer> numberStorage = new ArrayStorage<>(numbers);

        System.out.println("Элемент на индексе 2: " + numberStorage.getItemByIndex(2));

        String[] words = {"hello", "world", "java"};
        ArrayStorage<String> stringStorage = new ArrayStorage<>(words);

        System.out.println("Элемент на индексе 1: " + stringStorage.getItemByIndex(1));
    }
}
