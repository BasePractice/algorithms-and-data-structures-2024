package ru.mirea.practice.s0000001;

/**
 * Создать обобщенный класс с тремя параметрами (T, V, K).
 */

public abstract class Task1 {
    public static void main(String[] args) {
        SomeRandomClass<String, Integer, Double> randomClass = new SomeRandomClass<String, Integer, Double>("hello", 1, 1.0);
        new SomeRandomClass<Character, SomeRandomClass<String, Integer, Double>, String>('a', randomClass, " what ");
    }

    static class SomeRandomClass<T, V, K> {
        SomeRandomClass(T data, V value, K key) {
            System.out.println(data.getClass());
            System.out.println(value.getClass());
            System.out.println(key.getClass());
        }
    }
}
