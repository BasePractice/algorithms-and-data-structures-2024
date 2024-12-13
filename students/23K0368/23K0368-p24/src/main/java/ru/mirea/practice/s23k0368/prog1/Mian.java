package ru.mirea.practice.s23k0368.prog1;

public abstract class Mian {
    public static void main(String[] args) {
        CompexAbstractFactory factory = new ConcreateFactory();

        Complex complex1 = factory.createComplex(3, 4);
        Complex complex2 = factory.createComplex(1, -2);

        System.out.println("complex1: " + complex1);
        System.out.println("complex2: " + complex2);

        System.out.println("Addition: " + complex1.add(complex2));
        System.out.println("Subtraction: " + complex1.subtract(complex2));
        System.out.println("Multiplication: " + complex1.multiply(complex2));

        try {
            System.out.println("Division: " + complex1.divide(complex2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
