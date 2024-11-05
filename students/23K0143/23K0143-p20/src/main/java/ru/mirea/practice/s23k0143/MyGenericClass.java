package ru.mirea.practice.s23k0143;

import java.io.Serializable;

public class MyGenericClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public MyGenericClass(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Тип первого параметра: " + first.getClass().getName());
        System.out.println("Тип второго параметра: " + second.getClass().getName());
        System.out.println("Тип третьего параметра: " + third.getClass().getName());
    }
}
