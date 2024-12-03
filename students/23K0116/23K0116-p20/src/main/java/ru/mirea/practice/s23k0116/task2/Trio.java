package ru.mirea.practice.s23k0116.task2;

public class Trio<T, V, K> {
    private T first;
    private V second;
    private K third;

    public Trio(T first, V second, K third) {
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

    // Метод для вывода на консоль имен классов переменных
    public void printClassNames() {
        System.out.println("Тип первой переменной: " + first.getClass().getName());
        System.out.println("Тип второй переменной: " + second.getClass().getName());
        System.out.println("Тип третьей переменной: " + third.getClass().getName());
    }
}

