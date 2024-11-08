package ru.mirea.practice.s23k0155.task1;

public abstract class Test {
    public static void main(String[] args) {

        // Test MinMax
        Integer[] numbers = {1, 3, 5, 2, 4};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Min: " + minMax.getMin());
        System.out.println("Max: " + minMax.getMax());

        // Test Calculator
        System.out.println("Sum: " + Calculator.sum(5, 3));
        System.out.println("Subtract: " + Calculator.subtract(5, 3));
        System.out.println("Multiply: " + Calculator.multiply(5, 3));
        System.out.println("Divide: " + Calculator.divide(5, 3));
    }
}