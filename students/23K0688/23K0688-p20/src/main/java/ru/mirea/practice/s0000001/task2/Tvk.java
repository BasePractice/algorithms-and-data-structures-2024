package ru.mirea.practice.s0000001.task2;

// Обобщенный класс с тремя переменными типов T, V, K
public class Tvk<T,V,K> {
    private T t;
    private V v;
    private K k;

    public Tvk(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public void printValues() {
        System.out.println("T: " + t);
        System.out.println("V: " + v);
        System.out.println("K: " + k);
    }

    public void printNames() {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
        System.out.println("K: " + k.getClass().getName());
    }
}
