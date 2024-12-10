package ru.mirea.practice.s0000001;

import java.io.Serializable;

public class Generic<T extends Comparable<T> & Serializable, V extends Animal & Serializable, K> {
    private T t;
    private V v;
    private K k;

    public Generic(T t, V v, K k) {
        this.k = k;
        this.t = t;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public void getNames() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(k.getClass().getName());
    }
}
