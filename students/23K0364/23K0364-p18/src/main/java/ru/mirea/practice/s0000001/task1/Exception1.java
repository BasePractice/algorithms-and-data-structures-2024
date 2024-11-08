package ru.mirea.practice.s0000001.task1;

public class Exception1 {
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }

    public static void main(String[] args) {
        Exception1 example = new Exception1();
        example.exceptionDemo();
    }
}

//программа вызывает исключение деления на ноль

