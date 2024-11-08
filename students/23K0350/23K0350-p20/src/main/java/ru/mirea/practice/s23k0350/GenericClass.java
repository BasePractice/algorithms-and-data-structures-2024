package ru.mirea.practice.s23k0350;

public class GenericClass<T, V, K> {
    private T firstValue;
    private V secondValue;
    private K thirdValue;

    public GenericClass(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public T getFirstValue() {
        return firstValue;
    }

    public V getSecondValue() {
        return secondValue;
    }

    public K getThirdValue() {
        return thirdValue;
    }

    @Override
    public String toString() {
        return "GenericClass{"
                + "firstValue="
                + firstValue
                + ", secondValue="
                + secondValue
                + ", thirdValue="
                + thirdValue
                + '}';
    }

    public static void main(String[] args) {
        GenericClass<String, Integer, Double> example = new GenericClass<>("Test", 100, 99.99);
        System.out.println(example);
    }
}