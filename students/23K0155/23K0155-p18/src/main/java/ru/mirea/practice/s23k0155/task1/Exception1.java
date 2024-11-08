package ru.mirea.practice.s23k0155.task1;

public abstract class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
