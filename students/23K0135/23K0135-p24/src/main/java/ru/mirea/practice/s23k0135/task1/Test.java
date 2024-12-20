package ru.mirea.practice.s23k0135.task1;

public abstract class Test {
    public static void main(String[] args) {
        ComplexAbst factory = new ConcFactrory();

        Complex defaultComplex = factory.createComplex();
        System.out.println("Комплексное число: " + defaultComplex);

        Complex customComplex = factory.createComplex(2, 1);
        System.out.println("Комплексное число: " + customComplex);
    }
}
