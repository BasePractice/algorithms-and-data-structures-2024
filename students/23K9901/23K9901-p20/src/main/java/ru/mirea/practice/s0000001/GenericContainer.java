package ru.mirea.practice.s0000001;

abstract class GenericContainer<T, V, K> {
    protected T firstValue;
    protected V secondValue;
    protected K thirdValue;

    public GenericContainer(T firstValue, V secondValue, K thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public abstract void displayValues();
}
