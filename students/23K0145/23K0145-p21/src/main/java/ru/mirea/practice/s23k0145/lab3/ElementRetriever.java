package ru.mirea.practice.s23k0145.lab3;

import java.util.Objects;

public abstract class ElementRetriever {

    // Обобщенный метод для получения элемента массива
    public static <T> T fetchElement(T[] array, int index) {
        Objects.requireNonNull(array, "Массив не должен быть null");
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException("Некорректный индекс: " + index);
        }
        return array[index];
    }

    public static void main(String[] args) {
        // Пример с массивом строк
        String[] fruits = {"яблоко", "банан", "вишня"};
        System.out.println("Элемент на позиции 1: " + fetchElement(fruits, 1));

        // Пример с массивом чисел
        Integer[] numbers = {10, 20, 30, 40};
        System.out.println("Элемент на позиции 2: " + fetchElement(numbers, 2));

        // Пример с массивом символов
        Character[] letters = {'A', 'B', 'C'};
        System.out.println("Элемент на позиции 0: " + fetchElement(letters, 0));
    }
}
