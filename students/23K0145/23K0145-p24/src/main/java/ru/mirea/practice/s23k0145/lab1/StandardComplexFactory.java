package ru.mirea.practice.s23k0145.lab1;

class StandardComplexFactory implements ComplexNumberFactory {
    @Override
    public ComplexNumber createComplexNumber() {
        return new ComplexNumber();
    }

    @Override
    public ComplexNumber createComplexNumber(int realPart, int imaginaryPart) {
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
