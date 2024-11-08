package ru.mirea.practice.s29k0112;

public class GenericClass<T, V, K> {
    private T first;
    private V second;
    private K third;

    public GenericClass(T first, V second, K third) {
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
        System.out.println("Тип первой переменной: " + first.getClass().getName());
        System.out.println("Тип второй переменной: " + second.getClass().getName());
        System.out.println("Тип третьей переменной: " + third.getClass().getName());
    }
}
