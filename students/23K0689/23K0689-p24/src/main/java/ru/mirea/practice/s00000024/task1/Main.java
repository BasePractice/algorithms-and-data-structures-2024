package ru.mirea.practice.s00000024.task1;

public final class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(3, 4);

        System.out.println("Complex1: " + complex1);
        System.out.println("Complex2: " + complex2);
    }

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса
    private Main() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated.");
    }
}
