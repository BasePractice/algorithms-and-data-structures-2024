package ru.mirea.practice.s23k0087;

public final class Exception1 {
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
}
