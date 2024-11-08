package ru.mirea.practice.s0000001;

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
        return "Triple{" + "first = " + first + ", second = " + second + ", third = " + third + '}';
    }

    public static void main(String[] args) {

        Triple<String, Integer, Double> triple = new Triple<>("Example", 22, 3.14);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());
        System.out.println(triple);
    }
}
