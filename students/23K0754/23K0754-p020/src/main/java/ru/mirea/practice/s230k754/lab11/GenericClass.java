package ru.mirea.practice.s230k754.lab11;

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Serializable, K extends Animals & Serializable> {

    private T value1;
    private V value2;
    private K value3;

    public GenericClass(T value1, V value2, K value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    public K getValue3() {
        return value3;
    }

    public void setValue3(K value3) {
        this.value3 = value3;
    }

    public void printClassNames() {
        System.out.println("Имя класса для value1: " + value1.getClass().getSimpleName());
        System.out.println("Имя класса для value2: " + value2.getClass().getSimpleName());
        System.out.println("Имя класса для value3: " + value3.getClass().getSimpleName());
    }
}


