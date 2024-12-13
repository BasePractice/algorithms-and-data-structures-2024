package ru.mirea.practice.s0000001;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex1(int image, int real) {
        return new Complex(image, real);
    }
}
