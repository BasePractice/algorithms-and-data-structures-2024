package ru.mirea.practice.s0000001.task1;

public class Exception1 {
    public void exceptionDemo1() {
        try {
            System.out.println(2 / 0);
        } catch (Exception e) {
            System.out.println("Division by zero");
        }
    }

    public void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }
}
