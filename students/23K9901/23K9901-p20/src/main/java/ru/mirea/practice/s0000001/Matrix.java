package ru.mirea.practice.s0000001;

abstract class Matrix<T extends Number> {
    protected T[][] elements;

    public Matrix(T[][] elements) {
        this.elements = elements;
    }

    public abstract Matrix<T> add(Matrix<T> other);

    public abstract Matrix<T> multiply(Matrix<T> other);

    public abstract void display();
}
