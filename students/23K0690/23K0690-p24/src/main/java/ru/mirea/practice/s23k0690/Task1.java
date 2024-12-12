package ru.mirea.practice.s23k0690;


public abstract class Task1 {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Def n: " + defaultComplex);

        Complex customComplex = factory.createComplex(2, 2);
        System.out.println("Cut n: " + customComplex);
    }
}

