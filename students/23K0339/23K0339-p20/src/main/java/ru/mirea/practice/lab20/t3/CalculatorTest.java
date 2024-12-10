package ru.mirea.practice.lab20.t3;

public abstract class CalculatorTest {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 5;


        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Subtract: " + Calculator.subtract(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
    }
}

