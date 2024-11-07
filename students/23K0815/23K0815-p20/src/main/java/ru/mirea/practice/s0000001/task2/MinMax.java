package ru.mirea.practice.s0000001.task2;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public T getMax() {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {3, 5, 1, 8, 2};
        MinMax<Integer> minMaxInt = new MinMax<>(intArray);
        System.out.println("Min: " + minMaxInt.getMin());
        System.out.println("Max: " + minMaxInt.getMax());

        String[] strArray = {"apple", "orange", "banana", "kiwi"};
        MinMax<String> minMaxStr = new MinMax<>(strArray);
        System.out.println("Min: " + minMaxStr.getMin());
        System.out.println("Max: " + minMaxStr.getMax());
    }
}