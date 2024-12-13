package ru.mirea.practice.s0000001.task1;

public abstract  class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Default complex number: " + defaultComplex);

        Complex customComplex = factory.createComplex(5, 10);
        System.out.println("Custom complex number: " + customComplex);
    }
}
