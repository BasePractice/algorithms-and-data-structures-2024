package ru.mirea.practice.s23k0089.task1;

public class Triple<T, V, K> {

    private T first;
    private V second;
    private K third;

    public Triple(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void printClassNames() {
        System.out.println("Первый параметр: " + first.getClass().getName());
        System.out.println("Вторая параметр: " + second.getClass().getName());
        System.out.println("Третья параметр: " + third.getClass().getName());
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
}
