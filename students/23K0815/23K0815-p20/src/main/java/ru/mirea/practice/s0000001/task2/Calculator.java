package ru.mirea.practice.s0000001.task2;

public final class Calculator {

    // Приватный конструктор, чтобы предотвратить создание экземпляров
    private Calculator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        Integer a = 10;
        Double b = 5.5;

        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
        System.out.println("Subtract: " + Calculator.subtract(a, b));
    }
}
