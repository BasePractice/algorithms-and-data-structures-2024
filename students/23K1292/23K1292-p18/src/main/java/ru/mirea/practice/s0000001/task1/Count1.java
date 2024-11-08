package ru.mirea.practice.s0000001.task1;

public final class Count1 {

    private Count1() {

    }

    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
