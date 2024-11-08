package ru.mirea.practice.s0000001;

public class GenericTriple<T, V, K> {
    private T first;   // Первый элемент
    private V second;  // Второй элемент
    private K third;   // Третий элемент

    public GenericTriple(T first, V second, K third) {
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
        return "GenericTriple{"
                +
                "first=" + first
                +
                ", second=" + second
                +
                ", third=" + third
                +
                '}';
    }

    public static void main(String[] args) {
        GenericTriple<String, Integer, Double> triple = new GenericTriple<>("Example", 10, 20.5);

        System.out.println("Первый элемент: " + triple.getFirst());
        System.out.println("Второй элемент: " + triple.getSecond());
        System.out.println("Третий элемент: " + triple.getThird());
        System.out.println(triple);
    }
}
