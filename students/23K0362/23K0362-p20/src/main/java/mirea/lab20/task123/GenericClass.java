package ru.mirea.lab20.task1_3;

/*
1. Создать обобщенный класс с тремя параметрами (T, V, K).
2. Класс содержит три переменные типа (T, V, K), конструктор,
принимающий на вход параметры типа (T, V, K), методы возвращающие
значения трех переменных. Создать метод, выводящий на консоль имена
классов для трех переменных класса.
3. Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable
(классы оболочки, String), V должен реализовать интерфейс Serializable и расширять класс Animal,
 K должен расширять класс Number.
 */

import java.io.Serializable;

public class GenericClass<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    private T tend;
    private V value;
    private K key;

    public GenericClass(T tend, V value, K key) {
        this.tend = tend;
        this.value = value;
        this.key = key;
    }

    public T getTend() {
        return tend;
    }

    public void setTend(T tend) {
        this.tend = tend;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void printNamesClasses() {
        System.out.println("Name class of T: " + tend.getClass());
        System.out.println("Name class of V: " + value.getClass());
        System.out.println("Name class of K: " + key.getClass());
    }

    @Override
    public String toString() {
        return "GenericClass{" + "tend=" + tend + ", value=" + value + ", key=" + key + '}';
    }
}