package ru.mirea.practice.s0000001.task2;


public abstract class Main {
    public static void main(String[] args) {
        CompexAbstractFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(1, 2);
        System.out.println(complex1);
        System.out.println(complex2);
    }
}