package ru.mirea.practice.s0000001.task1;

import java.io.Serializable;

public class Triple<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
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
        System.out.println("Class of T: " + first.getClass().getName());
        System.out.println("Class of V: " + second.getClass().getName());
        System.out.println("Class of K: " + third.getClass().getName());
    }
}

