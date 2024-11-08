package ru.mirea.practice.s23k0140.task1;

public final class Exception1 {

    private Exception1() {

    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}