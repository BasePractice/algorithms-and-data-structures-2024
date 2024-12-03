package ru.mirea.practice.lab20.t1;

import java.io.Serializable;

public class MyClass<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private final T t;
    private final V v;
    private final K k;


    public MyClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }


    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }


    public void printClasses() {
        System.out.println("Class of T: " + t.getClass().getName());
        System.out.println("Class of V: " + v.getClass().getName());
        System.out.println("Class of K: " + k.getClass().getName());
    }
}
