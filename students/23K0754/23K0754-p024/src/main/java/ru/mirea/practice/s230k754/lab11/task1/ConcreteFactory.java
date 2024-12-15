package ru.mirea.practice.s230k754.lab11.task1;

public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int a, int b) {
        return null;
    }
}
