package ru.mirea.practice.s23k0120.task1;

public abstract class Exception2 {
    public static void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        exceptionDemo(); // floating point Infinity
    }
}
