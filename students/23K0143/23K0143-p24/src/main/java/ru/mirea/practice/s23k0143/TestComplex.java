package ru.mirea.practice.s23k0143;

public abstract class TestComplex {
    public static void main(String[] args) {
        ComplexFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Комплексное число: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");

        Complex complex2 = factory.createComplex(3, 4);
        System.out.println("Комплексное число: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");
    }
}
