package ru.mirea.practice.s23k0145.lab1;

interface ComplexNumberFactory {
    ComplexNumber createComplexNumber();

    ComplexNumber createComplexNumber(int realPart, int imaginaryPart);
}
