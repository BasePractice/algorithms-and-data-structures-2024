package ru.mirea.practice.s23k0140.task3;

public abstract class Main {

    public static <E> E getElement(E[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] stringArray = {"Apple", "Banana", "Cherry"};
        System.out.println("Элемент по индексу 1: " + getElement(stringArray, 1));

        Integer[] integerArray = {10, 20, 30};
        System.out.println("Элемент по индексу 0: " + getElement(integerArray, 0));
    }
}