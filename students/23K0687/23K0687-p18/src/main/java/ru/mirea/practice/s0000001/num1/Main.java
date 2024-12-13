package ru.mirea.practice.s0000001.num1;

public class Main {

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }

    public static void main(String[] args) {
        Main ex = new Main();
        ex.exceptionDemo();
    }
}
