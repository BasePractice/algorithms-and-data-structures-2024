package ru.mirea.practice.s23k0116.task1;

public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        return new Complex(0, 0); // Комплексное число по умолчанию
    }

    @Override
    public Complex createComplex(int real, int image) {
        return new Complex(real, image); // Комплексное число с заданными значениями
    }
}
