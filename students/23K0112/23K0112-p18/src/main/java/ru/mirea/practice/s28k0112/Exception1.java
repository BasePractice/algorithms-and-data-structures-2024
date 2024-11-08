package ru.mirea.practice.s28k0112;

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

    public static void main(String[] args) {
        exceptionDemo();
    }
}