package ru.mirea.practice.u23k1158.t1;

public class Triplet<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Triplet(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printClassNames() {
        System.out.println("Первая переменная: " + first.getClass().getName());
        System.out.println("Вторая переменная: " + second.getClass().getName());
        System.out.println("Третья переменная: " + third.getClass().getName());
    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public V getSecond() {
        return second;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public K getThird() {
        return third;
    }

    public void setThird(K third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triplet{"
                + "first=" + first
                + ", second=" + second
                + ", third=" + third
                + '}';
    }
}