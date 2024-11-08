package ru.mirea.practice.s0000001.task2;

public abstract class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtract(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}

