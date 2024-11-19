package ru.mirea.practice.s0000001.task1;

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

    @Override
    public String toString() {
        return "Triple{"
            +
            "first=" + first
            +
            ", second=" + second
            +
            ", third=" + third
            +
            '}';
    }
}
