package ru.mirea.practice.s23k0135.task1;

public class ConcFactrory implements ComplexAbst {

    @Override
    public Complex createComplex() {
        return new Complex(0, 0);
    }

    @Override
    public Complex createComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}
