package ru.mirea.practice.s23k1167.task2;

import java.util.List;
import java.util.ArrayList;

public class GenericArray<T> {
    private List<T> list;

    public GenericArray() {
        list = new ArrayList<>(); // Мы можем менять реализацию на другую в будущем
    }

    public void add(T element) {
        list.add(element);
    }

    public T get(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public void remove(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона");
        }
        list.remove(index);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        GenericArray<Object> genericArray = new GenericArray<>();

        // Пример использования
        genericArray.add(10); // int
        genericArray.add(20L); // long
        genericArray.add("Hello"); // String
        genericArray.add(3.14); // double

        System.out.println("Массив: " + genericArray);
        System.out.println("Элемент по индексу 2: " + genericArray.get(2));
        System.out.println("Размер массива: " + genericArray.size());

        genericArray.remove(1); // Удаляем элемент по индексу 1
        System.out.println("После удаления элемента: " + genericArray);
    }
}
