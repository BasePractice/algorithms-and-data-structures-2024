package ru.mirea.practice.s23k0145.num1;

public final class Excep1 {

    private Excep1() {

    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
