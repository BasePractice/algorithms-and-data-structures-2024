package ru.mirea.practice.s0000001.task1;

public abstract class Exception1 {
    public static void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();// из-за ArithmeticException часть кода (System.out.println( 2/0 );) не будет
        // выполняться и программа выведит строку: "Attempted division by zero"
    }
}
