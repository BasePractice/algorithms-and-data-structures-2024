package ru.mirea.practice.s0000001.task2;

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
        System.out.println("Class of first: " + first.getClass().getName());
        System.out.println("Class of second: " + second.getClass().getName());
        System.out.println("Class of third: " + third.getClass().getName());
    }

    public static void main(String[] args) {
        Triple<Integer, String, Double> triple = new Triple<>(123, "Hello", 45.67);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());

        triple.printClassNames();
    }
}

