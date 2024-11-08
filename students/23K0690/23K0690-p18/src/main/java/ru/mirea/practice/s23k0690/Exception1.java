package ru.mirea.practice.s23k0690;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
    }
}
