package ru.mirea.practice.s23k0690;

public abstract class Task1 {
    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo();
        //сбой программы Exception in thread "main" java.lang.ArithmeticException: /
        // by zero at ru.mirea.task18.task1.Exception1.exceptionDemo1(Exception1.java:5)
        //Или catch выводит сообщение:Division by zero
    }
}