package ru.mirea.practice.lab24.t1;

public abstract class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Complex 1: " + complex1);

        Complex complex2 = factory.createComplex(3, 4);
        System.out.println("Complex 2: " + complex2);
    }
}
