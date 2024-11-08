package ru.mirea.practice.s0000001.n3;

import java.io.Serializable;

public class ConstrainedTriple<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public ConstrainedTriple(T first, V second, K third) {
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
        System.out.println("Тип T: " + first.getClass().getName());
        System.out.println("Тип V: " + second.getClass().getName());
        System.out.println("Тип K: " + third.getClass().getName());
    }
}
