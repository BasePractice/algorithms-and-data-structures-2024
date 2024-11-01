package ru.mirea.practice.s23k0823.task1.task1.task1;

public class GenericClass<T, V, K> {
    private T fieldT;
    private V fieldV;
    private K fieldK;

    public GenericClass(T fieldT, V fieldV, K fieldK) {
        this.fieldT = fieldT;
        this.fieldV = fieldV;
        this.fieldK = fieldK;
    }

    public T getFieldT() {
        return fieldT;
    }

    public void setFieldT(T fieldT) {
        this.fieldT = fieldT;
    }

    public V getFieldV() {
        return fieldV;
    }

    public void setFieldV(V fieldV) {
        this.fieldV = fieldV;
    }

    public K getFieldK() {
        return fieldK;
    }

    public void setFieldK(K fieldK) {
        this.fieldK = fieldK;
    }
}
