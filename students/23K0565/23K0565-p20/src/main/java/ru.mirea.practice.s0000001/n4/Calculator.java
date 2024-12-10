package ru.mirea.practice.s0000001.n4;

public final class Calculator {
    private Calculator() {
    }

    public static <N extends Number, M extends Number> double sum(N a, M b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <N extends Number, M extends Number> double multiply(N a, M b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <N extends Number, M extends Number> double divide(N a, M b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Деление на ноль запрещено!");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <N extends Number, M extends Number> double subtract(N a, M b) {
        return a.doubleValue() - b.doubleValue();
    }
}
