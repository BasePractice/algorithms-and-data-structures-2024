package ru.mirea.practice.s23k0375.task1;

public abstract class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Default complex number: " + defaultComplex);

        Complex customComplex = factory.createComplex(7, 2);
        System.out.println("Custom complex number: " + customComplex);
    }
}

