package ru.mirea.practice.s0000001;

public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}
