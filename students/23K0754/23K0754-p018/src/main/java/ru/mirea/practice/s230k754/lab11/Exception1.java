package ru.mirea.practice.s230k754.lab11;

public abstract class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void exceptionDemoWithFloat() {
        System.out.println(2.0 / 0.0);
    }
}
