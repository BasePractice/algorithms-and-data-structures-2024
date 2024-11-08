package ru.mirea.practice.s0000001.task2;

public abstract class MainCalculator {
    public static void main(String[] args) {
        System.out.println("Sum: " + Calculator.sum(10, 5.5));
        System.out.println("Multiply: " + Calculator.multiply(4, 2.5));
        System.out.println("Divide: " + Calculator.divide(10, 2));
        System.out.println("Subtract: " + Calculator.subtract(10, 2.5));
    }
}
