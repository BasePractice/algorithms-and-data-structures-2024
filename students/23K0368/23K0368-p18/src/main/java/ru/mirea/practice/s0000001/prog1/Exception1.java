package ru.mirea.practice.s0000001.prog1;

public abstract class Exception1 {
    public static void exceptionDemo1() {
        System.out.println(2 / 0);
    }

    public static void exceptionDemo2() {
        System.out.println(2.0 / 0.0);
    }

    public static void exceptionDemo3() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo2();//Получили бесконечность как пример математического представления деления
        exceptionDemo3();//Обработали ошибку
        exceptionDemo1();//Получили ошибку деления на ноль
    }
}
