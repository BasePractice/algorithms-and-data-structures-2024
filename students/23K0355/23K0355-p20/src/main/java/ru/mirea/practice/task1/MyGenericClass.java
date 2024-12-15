package ru.mirea.practice.task1;

public class MyGenericClass<T, V, K> {

    private T a;
    private V b;
    private K c;

    public MyGenericClass(T a, V b, K c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public K getC() {
        return c;
    }

    public void printClassNames() {
        System.out.println("Тип первой переменной: " + a.getClass().getName());
        System.out.println("Тип второй переменной: " + b.getClass().getName());
        System.out.println("Тип третьей переменной: " + c.getClass().getName());
    }

    public static void main(String[] args) {
        MyGenericClass<Integer, String, Double> obj = new MyGenericClass<>(10, "Привет", 3.14);
        System.out.println("Первая переменная: " + obj.getA());
        System.out.println("Вторая переменная: " + obj.getB());
        System.out.println("Третья переменная: " + obj.getC());
        obj.printClassNames();
    }
}
