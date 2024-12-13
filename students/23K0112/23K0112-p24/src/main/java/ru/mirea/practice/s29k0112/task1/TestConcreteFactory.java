package ru.mirea.practice.s29k0112.task1;

public final class TestConcreteFactory {
    private TestConcreteFactory() {

    }

    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        System.out.println("Created complex: " + complex1);

        Complex complex2 = factory.createComplex(3, 4);
        System.out.println("Created complex: " + complex2);
    }
}
