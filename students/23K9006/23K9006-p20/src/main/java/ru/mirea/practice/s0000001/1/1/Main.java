package ru.mirea.practice.s0000001;

public final class Main {

    private Main() {
        // Private constructor to prevent instantiation
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 4};
        IntegerMinMax intMinMax = new IntegerMinMax(intArray);
        System.out.println("Minimum: " + intMinMax.getMin());
        System.out.println("Maximum: " + intMinMax.getMax());

        String[] strArray = {"apple", "banana", "kiwi", "orange"};
        StringMinMax strMinMax = new StringMinMax(strArray);
        System.out.println("Minimum: " + strMinMax.getMin());
        System.out.println("Maximum: " + strMinMax.getMax());

        System.out.println("Sum: " + Calculator.sum(5, 10.5));
        System.out.println("Subtraction: " + Calculator.subtraction(10.5, 5));
        System.out.println("Multiplication: " + Calculator.multiply(3, 4.5));
        System.out.println("Division: " + Calculator.divide(10, 2));
    }
}
