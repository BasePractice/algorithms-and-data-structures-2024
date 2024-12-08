package ru.mirea.practice.s23k0116.task2and3;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    // Получить элемент по индексу
    public T get(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне допустимого диапазона");
        }
        return array[index];
    }

    // Получить длину массива
    public int length() {
        return array.length;
    }

    // Получить строковое представление массива
    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public static void main(String[] args) {
        // Пример для массива целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericArray<Integer> genericIntArray = new GenericArray<>(intArray);
        System.out.println("Массив целых чисел: " + genericIntArray);
        System.out.println("Элемент с индексом 2: " + genericIntArray.get(2));

        // Пример для массива строк
        String[] stringArray = {"apple", "banana", "cherry"};
        GenericArray<String> genericStringArray = new GenericArray<>(stringArray);
        System.out.println("Массив строк: " + genericStringArray);
        System.out.println("Элемент с индексом 1: " + genericStringArray.get(1));
    }
}
