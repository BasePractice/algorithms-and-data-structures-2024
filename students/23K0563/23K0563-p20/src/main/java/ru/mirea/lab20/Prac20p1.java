package mirea.lab20;

/* Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие
значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса.  */

public class Prac20p1<T, V, K> {

    private T t;
    private V v;
    private K k;

    public Prac20p1(T t, V v, K k) {
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

    public void prtypes() {
        System.out.println(t.getClass().toString());
        System.out.println(v.getClass().toString());
        System.out.println(k.getClass().toString());
    }
}
