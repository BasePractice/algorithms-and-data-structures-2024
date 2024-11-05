package ru.mirea.practice.s0000001.prog1;

public class Generalized<T, V, K> {
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

    @Override
    public String toString() {
        return "Generalized{"
                + "t=" + t
                + ", v=" + v
                + ", k=" + k
                + '}';
    }
}
