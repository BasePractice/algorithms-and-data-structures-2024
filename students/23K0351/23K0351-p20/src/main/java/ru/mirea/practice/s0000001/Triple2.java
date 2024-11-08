package ru.mirea.practice.s0000001;

public class Triple2<T, V, K> {
    private T first;
    private V second;
    private K third;


    public Triple2(T first, V second, K third) {
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

        Triple2<String, Integer, Double> triple = new Triple2<>("Example", 22, 3.14);

        System.out.println("First: " + triple.getFirst());
        System.out.println("Second: " + triple.getSecond());
        System.out.println("Third: " + triple.getThird());


        triple.printClassNames();
    }
}
