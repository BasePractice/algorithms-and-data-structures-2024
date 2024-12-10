package ru.mirea.practice.s0000001.prog3;

import java.io.Serializable;

public class Generalized<T extends Comparable<T>, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public Generalized(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void print() {
        System.out.println("First Class is " + t.getClass().getName());
        System.out.println("Second Class is " + v.getClass().getName());
        System.out.println("Third Class is " + k.getClass().getName());
    }
}
