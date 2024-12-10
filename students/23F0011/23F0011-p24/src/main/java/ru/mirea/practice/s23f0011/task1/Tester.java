package ru.mirea.practice.s23f0011.task1;

public abstract class Tester {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Комплексное число: " + defaultComplex);

        Complex customComplex = factory.createComplex(20, -5);
        System.out.println("Комплексное число: " + customComplex);
    }
}

