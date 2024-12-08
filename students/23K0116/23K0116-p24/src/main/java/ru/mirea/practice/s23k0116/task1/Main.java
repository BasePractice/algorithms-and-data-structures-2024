package ru.mirea.practice.s23k0116.task1;

public abstract class Main {
    public static void main(String[] args) {
        // Создание фабрики
        ComplexAbstractFactory factory = new ConcreteFactory();

        // Создание комплексного числа с нулевыми значениями
        Complex defaultComplex = factory.createComplex();
        System.out.println("Комплексное число по умолчанию: " + defaultComplex);

        // Создание комплексного числа с заданными значениями
        Complex customComplex = factory.createComplex(3, 4);
        System.out.println("Комплексное число: " + customComplex);
    }
}
