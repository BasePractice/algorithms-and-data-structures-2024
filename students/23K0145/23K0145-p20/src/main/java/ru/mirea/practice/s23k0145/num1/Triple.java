package ru.mirea.practice.s23k0145.num1;

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
        return "Triple{" + "first=" + first + ", second=" + second + ", third=" + third + '}';
    }
}
