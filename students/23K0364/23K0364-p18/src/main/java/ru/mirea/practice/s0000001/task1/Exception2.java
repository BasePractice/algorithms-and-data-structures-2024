package ru.mirea.practice.s0000001.task1;

public class Exception2 {
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }

    public static void main(String[] args) {
        Exception2 example = new Exception2();
        example.exceptionDemo();
    }
}

//программа вывела Infinity
