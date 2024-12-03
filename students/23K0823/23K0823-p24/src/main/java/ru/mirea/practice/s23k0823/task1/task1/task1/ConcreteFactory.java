package ru.mirea.practice.s23k0823.task1.task1.task1;

class ConcreteFactory implements CompexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image);
    }
}
