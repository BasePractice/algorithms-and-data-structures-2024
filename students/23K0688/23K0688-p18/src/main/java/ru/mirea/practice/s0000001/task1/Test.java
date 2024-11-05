package ru.mirea.practice.s0000001.task1;

public abstract class Test {
    public static void main(String[] args) {
        Exception1 ex = new Exception1();
        ex.exceptionDemo1();
        //сбой программы Exception in thread "main" java.lang.ArithmeticException: / by zero
        //at ru.mirea.task18.task1.Exception1.exceptionDemo1(Exception1.java:5)
        //at ru.mirea.task18.task1.test.main(test.java:6) при попытке деления на 90
        //catch ловит ошибку и выводит сообщение:Division by zero
        ex.exceptionDemo2();
        //Infinity по стандарту IEE
    }
}
