package ru.mirea.practice.s23k0145.num2;

public class Triple<T, V, K> {
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
        System.out.println("Тип первого элемента: " + first.getClass().getName());
        System.out.println("Тип второго элемента: " + second.getClass().getName());
        System.out.println("Тип третьего элемента: " + third.getClass().getName());
    }
}
