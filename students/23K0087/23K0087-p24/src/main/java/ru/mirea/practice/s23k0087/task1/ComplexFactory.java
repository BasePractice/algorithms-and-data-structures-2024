package ru.mirea.practice.s23k0087.task1;

public class ComplexFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int imag) {
        return new Complex(real, imag);
    }
}
