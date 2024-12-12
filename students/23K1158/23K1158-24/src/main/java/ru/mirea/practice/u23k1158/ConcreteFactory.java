package ru.mirea.practice.u23k1158;

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
