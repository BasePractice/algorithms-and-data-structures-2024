package ru.mirea.practice.s23f0011;

import java.io.Serializable;

class Triple<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T t;
    private final V v;
    private final K k;

    // Конструктор
    public Triple(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    // Методы для получения значений
    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    // Метод для вывода классов типов параметров
    public void printTypes() {
        System.out.println("Тип T: " + t.getClass().getName());
        System.out.println("Тип V: " + v.getClass().getName());
        System.out.println("Тип K: " + k.getClass().getName());
    }
}
