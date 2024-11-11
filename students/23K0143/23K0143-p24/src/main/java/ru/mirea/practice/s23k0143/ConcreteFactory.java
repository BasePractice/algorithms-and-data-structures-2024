package ru.mirea.practice.s23k0143;

public class ConcreteFactory implements ComplexFactory {
    @Override
    public Complex createComplex() {
        return new ConcreteComplex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new ConcreteComplex(real, imaginary);
    }
}
