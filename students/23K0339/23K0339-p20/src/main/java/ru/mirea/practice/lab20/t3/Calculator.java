package ru.mirea.practice.lab20.t3;

public abstract class Calculator {


    public static <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }


    public static <T extends Number> double divide(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }


    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }
}

