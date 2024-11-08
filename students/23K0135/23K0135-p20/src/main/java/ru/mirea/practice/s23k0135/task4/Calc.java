package ru.mirea.practice.s23k0135.task4;

public final class Calc {

    private Calc() {

    }

    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number> double  divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number> double  subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

}
