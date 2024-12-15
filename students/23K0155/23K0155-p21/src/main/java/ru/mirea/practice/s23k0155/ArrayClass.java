package ru.mirea.practice.s23k0155;

public class ArrayClass {
    private Object[] array;
    private int size;
    private int currentElement;

    public ArrayClass(int size) {
        this.size = size;
        this.currentElement = 0;
        this.array = new Object[size];
    }

    public void addElement(Object ellement) {
        this.array[currentElement++] = ellement;
    }

    // Метод, который возвращает любой элемент массива по индексу.
    public Object getElement(int index) {
        if (index >= size) {
            return "Ошибка ввода данных: выход за пределы массива";
        } else {
            return array[index];
        }
    }

    public void printArray() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
    }
}
