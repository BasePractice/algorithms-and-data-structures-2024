package ru.mirea.practice.s23k1158.t1;

public final class Except {

    private Except() {

    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}