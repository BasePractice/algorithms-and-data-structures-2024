package ru.mirea.practice.s0000001.task1;

public final class Calculator {

    private Calculator() {
        // Приватный конструктор предотвращает создание экземпляров
    }

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtract(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}
