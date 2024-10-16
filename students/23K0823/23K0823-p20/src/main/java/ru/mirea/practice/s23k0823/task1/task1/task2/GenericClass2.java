package ru.mirea.practice.s23k0823.task1.task1.task2;

public class GenericClass2<T, V, K> {

    private T fieldT;
    private V fieldV;
    private K fieldK;

    public GenericClass2(T fieldT, V fieldV, K fieldK) {
        this.fieldT = fieldT;
        this.fieldV = fieldV;
        this.fieldK = fieldK;
    }

    public T getFieldT() {
        return fieldT;
    }

    public V getFieldV() {
        return fieldV;
    }

    public K getFieldK() {
        return fieldK;
    }

    public void printClassNames() {
        System.out.println("Class of fieldT: " + fieldT.getClass().getName());
        System.out.println("Class of fieldV: " + fieldV.getClass().getName());
        System.out.println("Class of fieldK: " + fieldK.getClass().getName());
    }
}