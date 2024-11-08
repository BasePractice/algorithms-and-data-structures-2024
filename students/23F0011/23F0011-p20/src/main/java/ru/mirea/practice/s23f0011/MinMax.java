package ru.mirea.practice.s23f0011;

class MinMax<T extends Comparable<T>> {
    private final T[] array;

    // Конструктор
    public MinMax(T[] array) {
        this.array = array;
    }

    // Метод для нахождения минимального элемента
    public T min() {
        T min = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    // Метод для нахождения максимального элемента
    public T max() {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

